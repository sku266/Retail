package com.sapient.client.cui;
public class Check  extends Payment implements Authorization{

	private String bankID;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankID() {
		return bankID;
	}
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	
	public boolean authorization() {
		
		return true;
		
	}


	
	
	
	

}
