/**
 * 
 */
package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.client.cui.Item;
import com.sapient.client.cui.NewCustomer;
import com.sapient.client.cui.Order;
import com.sapient.client.cui.OrderDetail;
import com.sapient.client.cui.Payment;

/**
 * @author ilisze
 *
 */
public class OrderTest {
	Order testOrder;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("1/09/2015");
		List<OrderDetail> oD = null;
		testOrder = new Order(sdf, Order.Status.OnRoute, new NewCustomer(), new Payment(), oD);
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
		Item item3 = new Item(3.1, 3.573, 5.30, "", testOrderDetail3);
		testOrderDetail3.setItem(item3);
		oDSet.add(testOrderDetail3);
		testOrder.setOrderdetail(oDSet);
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
		String expectedValue = "AwaitingPayment";
		testOrder.setStatus(Order.Status.AwaitingPayment);
		String actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);
		
		expectedValue = "BackOrdered";
		testOrder.setStatus(Order.Status.BackOrdered);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		
		
		expectedValue = "OnReturnRoute";
		testOrder.setStatus(Order.Status.OnReturnRoute);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		

		expectedValue = "OnRoute";
		testOrder.setStatus(Order.Status.OnRoute);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		

		expectedValue = "PaymentDeclined";
		testOrder.setStatus(Order.Status.PaymentDeclined);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		

		expectedValue = "Pending";
		testOrder.setStatus(Order.Status.Pending);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		

		expectedValue = "PendingShippment";
		testOrder.setStatus(Order.Status.PendingShippment);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		

		expectedValue = "ReadyToShip";
		testOrder.setStatus(Order.Status.ReadyToShip);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		

		expectedValue = "Returned";
		testOrder.setStatus(Order.Status.Returned);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		

		expectedValue = "Shipped";
		testOrder.setStatus(Order.Status.Shipped);
		actualValue = testOrder.getStatus();
		assertEquals(expectedValue, actualValue);		
	}
	
	@Test
	public void testCalcTax() {
		double expectedTax = 124.48;
		double actualTax = testOrder.calcTax();
		assertEquals(expectedTax, actualTax, 0.005);
	}

	/**
	 * Test method for {@link com.sapient.client.cui.Order#calcTotal()}.
	 */
	@Test
	public void testCalcTotal() {
		double expectedTotal = 1490.38;
		double actualTotal = testOrder.calcTotal();
		assertEquals(expectedTotal, actualTotal, 0.005);
	}

	/**
	 * Test method for {@link com.sapient.client.cui.Order#calcTotalWeight()}.
	 */
	@Test
	public void testCalcTotalWeight() {
		double expectedWeight = 613.22;
		double actualWeight = testOrder.calcTotalWeight();
		assertEquals(expectedWeight, actualWeight, 0.005);
	}

}
