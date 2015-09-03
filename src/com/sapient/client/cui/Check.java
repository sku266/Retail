package com.sapient.client.cui;

public class Check  extends Payment implements Authorization{

	@Override
	public void authorization() {
		// TODO Auto-generated method stub
		
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBankID() {
		return BankID;
	}
	public void setBankID(int bankID) {
		BankID = bankID;
	}

	private int BankID;
	
	
	
	

}
