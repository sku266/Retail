/**
 * 
 */
package com.sapient.client.cui;


public class Item {
 
	int shippingWeight;
	String Description;
	
	OrderDetail Orderdetails;
	
	public OrderDetail getOrderdetails() {
		return Orderdetails;
	}
	public void setOrderdetails(OrderDetail orderdetails) {
		Orderdetails = orderdetails;
	}
	public int getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(int shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	

	
	public int getPriceforQuantity()
	{
		return (Integer) null;
	}
	
	
	public int getWeight()
	{
		return (Integer) null;
	}
	
	
	
}
