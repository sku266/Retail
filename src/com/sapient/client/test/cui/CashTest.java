package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Cash;
import com.sapient.client.cui.Payment;

public class CashTest {
	
	Cash cash = new Cash();
	Payment payment = new Payment();

	@Before
	public void setUp() throws Exception {
		
		payment.setAmount(1000);
		cash.setCashTendered(payment.getAmount());
		
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.cui.CashTest#testGetCashTendered(com.sapient.client.cui)}.
	 */
	@Test
	public final void testGetCashTendered() {
		int expectedResult = 1000;
		assertEquals(expectedResult, payment.getAmount());
	}

	

}
