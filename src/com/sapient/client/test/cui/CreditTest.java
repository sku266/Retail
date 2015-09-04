package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Credit;

public class CreditTest {

	Credit credit=new Credit();
	int creditCardNumber;
	Date expiryDate=new Date(2016-12-12);
	String CardType;
	@Before
	public void setUp() throws Exception {
		credit.setNumber(12345678);
		credit.setType("Visa");
		credit.setexpiryDate(expiryDate);
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	

	@Test
	public final void testGetNumber() {
		int expectedResult=12345678;
		creditCardNumber=credit.getNumber();
		assertEquals(expectedResult, creditCardNumber);
	}

	

	@Test
	public final void testGetType() {
	String expectedResult="Visa";
	CardType=credit.getType();
	assertEquals(expectedResult, CardType);
	}

	

	@Test
	public final void testGetexpiryDate() {
	Date expiryDate1=credit.getexpiryDate();
    assertEquals(expiryDate1, expiryDate);
	}


	@Test
	public final void testAuthorization() {
		boolean Result=credit.authorization();
		assertTrue(Result);
	}

}
