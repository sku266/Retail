/**
 * 
 */
package com.sapient.client.cui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author sku266
 *
 */
public class Credit extends Payment implements Authorization {

	private int creditCardNumber;
	String[] Card = { "Visa", "Maestro", "MasterCard" };

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
