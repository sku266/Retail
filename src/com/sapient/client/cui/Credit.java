/**
 * 
 */
package com.sapient.client.cui;

import java.util.Date;

/**
 * @author sku266
 *
 */
public class Credit extends Payment implements Authorization {

	private int number;
	private String type;
	private Date dd;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getDd() {
		return dd;
	}


	public void setDd(Date dd) {
		this.dd = dd;
	}


	
	
	
	
	
	@Override
	public void authorization() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
