package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Check;

public class CheckTest {
	private final static Map<String, String> bankDetails = new HashMap<String, String>();

	Check check = new Check();

	@Before
	public void setUp() throws Exception {
		 
		bankDetails.put("HDFCBank", "HDFC0001098");
		bankDetails.put("ICICI Bank", "ICICI000000");
		
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test method for {@link com.sapient.client.cui.CheckTest#getSetNametest(com.sapient.client.cui)}.
	 */

	@Test
	public void getSetNametest() {
		String expected = "HDFCBank";
		String actual = null;
		check = new Check();
		check.setName("HDFCBank");
		actual = check.getName();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.sapient.client.cui.CheckTest#getSetBankIdtest(com.sapient.client.cui)}.
	 */
	
	@Test
	public void getSetBankIdtest() {
		String expected = "HDFC0001098";
		String actual = null;
		check = new Check();
		check.setBankID("HDFC0001098");
		actual = check.getBankID();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link com.sapient.client.cui.CheckTest#authorizedTest(com.sapient.client.cui)}.
	 */
	
	@Test
	public void authorizedTest() {
		boolean actual=false;
		check.setBankID("HDFC0001098");
		check.setName("HDFCBank");
		Iterator <Map.Entry<String,String>>mapIterator=bankDetails.entrySet().iterator();
		while(mapIterator.hasNext()){
		      Map.Entry<String, String>entry= mapIterator.next();
		      //String name=entry.getKey();
		      //String bankid=entry.getValue();
		      String key = entry.getKey();
		      String checkName = check.getName();
		      String entryValue = entry.getValue();
		      String checkBankID = check.getBankID();
		      if(key == checkName && entryValue == checkBankID){
		    	  actual=check.authorization();
		      }
		     
			}

		assertTrue(actual);
		
		//actual = check.authorized();
		//assertEquals(expected, actual);
	}
}
