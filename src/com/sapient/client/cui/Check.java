package com.sapient.client.cui;

public class Check  extends Payment implements Authorization{

	private int bankID;


	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBankID() {
		return bankID;
	}
	public void setBankID(int bankID) {
		bankID = bankID;
	}
	
	public boolean authorization() {
		
		String stringBankId=Integer.toString(bankID);
		int length=stringBankId.length();
		
		if(length!=6)
		{
			return false;
		}
		
		return true;
	}


	
	
	
	

}
