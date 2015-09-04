/**
 * 
 */
package com.sapient.client.cui;

public class OrderDetail {

	public static enum Tax{
		small(5.0),
		medium(10.0),
		large(14.0);
		
		private double percentage;

		//Constructor
		Tax(double pct) {percentage = pct;}
		
		public double getRate() {return percentage;}
	}
	
	int quantity;
	double taxStatus;
	Order order;
	Item item;
	
	public OrderDetail(int quant, Tax taxes, Order order, Item item){
		setQuantity(quant);
		setTaxStatus(taxes);
		setOrder(order);
		setItem(item);
	}
	
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

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
	
	public double getTaxStatus() {
		return taxStatus;
	}
	
	public void setTaxStatus(Tax tax) {
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
	
	public double calSubTotal() {
		double itemPrice = item.getPriceForQuantity();
		double itemsCost = quantity * itemPrice; 
		return itemsCost + (itemsCost*taxStatus)/100;
	}
	
	public double calWeight() {
		double itemWeight = item.getShippingWeight();
		return quantity * itemWeight;
	}
	

	
	
}