/**
 * 
 */
package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.client.cui.Item;
import com.sapient.client.cui.Order;
import com.sapient.client.cui.OrderDetail;

/**
 * @author ilisze
 *
 */
public class orderTest {
	Order testOrder;
	List<OrderDetail> testOrderDetailList;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testOrder = new Order();
		List<OrderDetail> oDSet = new ArrayList<OrderDetail>();
		OrderDetail testOrderDetail1 = new OrderDetail(10, OrderDetail.Tax.small, testOrder, null);
		Item item1 = new Item(5.0, 5.5, 25.50, "", testOrderDetail1);
		testOrderDetail1.setItem(item1);
		oDSet.add(testOrderDetail1);
		
		OrderDetail testOrderDetail2 = new OrderDetail(15, OrderDetail.Tax.medium, testOrder, null);
		Item item2 = new Item(35.8, 36.5, 73.00, "", testOrderDetail2);
		testOrderDetail2.setItem(item2);
		oDSet.add(testOrderDetail2);
		
		OrderDetail testOrderDetail3 = new OrderDetail(3, OrderDetail.Tax.large, testOrder, null);
		Item item3 = new Item(3.1, 3.5, 5.30, "", testOrderDetail3);
		testOrderDetail3.setItem(item3);
		oDSet.add(testOrderDetail3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.cui.Order#calcTax()}.
	 */
	
	@Test
	public void testSetStatus(){
		
	}
	
	@Test
	public void testCalcTax() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.cui.Order#calcTotal()}.
	 */
	@Test
	public void testCalcTotal() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.cui.Order#calcTotalWeight()}.
	 */
	@Test
	public void testCalcTotalWeight() {
		fail("Not yet implemented");
	}

}
