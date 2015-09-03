/**
 * 
 */
package com.sapient.client.cui;


public class OrderDetail {

	int quantity;
	Boolean taxstatus=true;
	
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
	public Boolean getTaxstatus() {
		return taxstatus;
	}
	public void setTaxstatus(Boolean taxstatus) {
		this.taxstatus = taxstatus;
	}
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public int CalSubTotal()
	{
		return (Integer) null;
	}
	
	
	public int CalWeight()
	{
		return quantity;
		
	}
	

	
	
}