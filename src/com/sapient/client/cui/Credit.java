/**
 * 
 */
package com.sapient.client.cui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sku266
 *
 */
public class Credit extends Payment implements Authorization {

	private int creditCardNumber;
	
	 Map<String , String> Card = new HashMap<String, String>();
	
	 public void CreditCardType()
	 {
		 Card.put("Visa", "3425");
		 Card.put("Maestro","5423");
		 Card.put("Master", "2351");
	 }

	private String Cardtype;
	private Date expiryDate;

	public int getNumber() {
		return creditCardNumber;
	}

	public void setNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getType() {
		return Cardtype;
	}

	public void setType(String type) {
		this.Cardtype = type;
	}

	public Date getexpiryDate() {
		return expiryDate;
	}

	public void setexpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public boolean authorizeCardType(String cardType,int creditCardNumber)
	{
		String cardNumber=Integer.toString(creditCardNumber);
		
	    if(cardNumber.substring(0,3).equals(Card.get(cardType)))
	    {
	    	return true;
	    } 
		return false;
	}

	@Override
	public boolean authorization() {

		String cardNumber = Integer.toString(creditCardNumber);

		if (cardNumber.length() != 8) {
			return false;
		}

		Calendar calender = Calendar.getInstance();
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		int date = calender.get(Calendar.DATE);
		@SuppressWarnings("deprecation")
		Date currentDate = new Date(year, month, date);
		
		 /*DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 Date date = new Date();
		 Date currentDate=date;*/
		
		if(expiryDate.after(currentDate))
		{
			return false;
		}
		
		return true;

	}

}
