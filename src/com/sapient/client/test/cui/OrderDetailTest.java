/**
 * 
 */
package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Item;
import com.sapient.client.cui.OrderDetail;

/**
 * @author ilisze
 *
 */
public class OrderDetailTest {
	OrderDetail testDetail;
	Item testItem;
	/**
	 * @throws java.lang.Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		testItem = new Item();
		testItem.setPriceForQuantity(15.18);
		testItem.setShippingWeight(50.159);
		testDetail = new OrderDetail(20, OrderDetail.Tax.small, null, testItem);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.cui.OrderDetail#setTaxstatus(com.sapient.client.cui.Tax)}.
	 */
	@Test
	public void testSetTaxStatus() {
		double expectedVal = 5.0;
		testDetail.setTaxStatus(OrderDetail.Tax.small);
		double actualVal = testDetail.getTaxStatus();
		assert (expectedVal == actualVal);
		expectedVal = 10.0;
		actualVal = testDetail.getTaxStatus();
		testDetail.setTaxStatus(OrderDetail.Tax.small);
		assert (expectedVal == actualVal);
		expectedVal = 14.0;
		testDetail.setTaxStatus(OrderDetail.Tax.small);
		actualVal = testDetail.getTaxStatus();
		assert (expectedVal == actualVal);
	}

	/**
	 * Test method for {@link com.sapient.client.cui.OrderDetail#CalSubTotal()}.
	 */
	@Test
	public void testCalSubTotal() {
		double expectedValue = 318.78;
		double actualValue = testDetail.calSubTotal();
		assertEquals(expectedValue, actualValue, 0.005);
	}

	/**
	 * Test method for {@link com.sapient.client.cui.OrderDetail#CalWeight()}.
	 */
	@Test
	public void testCalWeight() {
		double expectedValue = 1003.18;
		double actualValue = testDetail.calWeight();
		assertEquals("expectedValue: " + expectedValue + "not equal to" + "actualValue: " + actualValue, expectedValue, actualValue, 0.005);
	}

}
