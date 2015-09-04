package com.sapient.client.test.cui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Check;

public class CheckTest {

	 Check check = new Check();
	 String name;
	 int bankID;
	
	@Before
	public void setUp() throws Exception {
      check.setName("ICICI");
      check.setBankID(123456);
	 
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetName() {
		

	}

	@Test
	public final void testGetBankID() {
		fail("Not yet implemented");
	}

	@Test
	public final void testAuthorization() {
		fail("Not yet implemented");
	}

}
