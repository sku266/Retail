/**
 * 
 */
package com.sapient.client.cui;

enum Tax{
	small(5.0),
	medium(10.0),
	large(14.0);
	
	private double percentage;

	//Constructor
	Tax(double pct) {percentage = pct;}
	
	double getRate() {return percentage;}
}

public class OrderDetail {

	int quantity;
	double taxStatus;
	Order order;
	Item item;
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTaxstatus() {
		return taxStatus;
	}
	
	public void setTaxstatus(Tax tax) {
		switch(tax){
			case small:
				taxStatus = tax.getRate();
				break;
			case medium:
				taxStatus = tax.getRate();
				break;
			case large:
				taxStatus = tax.getRate();
				break;
			default:
				taxStatus = Tax.medium.getRate();
		}
	}
		
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public double CalSubTotal() {
		return 0.0;
	}
	
	public double CalWeight() {
		return 0.0;
	}
	

	
	
}