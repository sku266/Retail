package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.NewCustomer;

public class NewCustomerTest {

	
	String name;
	String address;
	
    NewCustomer newcustomer=new NewCustomer();
	@Before
	public void setUp() throws Exception {
		name = "Vinay";
		address = "Gurgaon";
	 newcustomer.setName(name);
	   newcustomer.setAddress(address);
	   
	}

	@After
	public void tearDown() throws Exception {
		name=null;
		address=null;
	}

	@Test
	public final void testGetName() {
		String expectedName=name;
		
		String result=newcustomer.getName();
		assertEquals(expectedName, result);
		
		
	}

	@Test
	public final void testGetAddress() {
		String expectedAddress=address;
		String resultAddress=newcustomer.getAddress();
		assertEquals(expectedAddress, resultAddress);
	}

	@Test
	public final void testGetOrder() {
		fail("Not yet implemented");
	}

}
