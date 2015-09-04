/**
 * 
 */
package com.sapient.client.cui;

public class Item {

	double weight;
	double shippingWeight;
	double priceForQuantity;
	String Description;
	
	OrderDetail OrderDetails;
	
	public Item(){
		
	}
	
	public Item(double w, double sW, double price, String desc, OrderDetail oD){
		this.setWeight(w);
		this.setShippingWeight(sW);
		this.setPriceForQuantity(price);
		this.setDescription(desc);
		this.setOrderDetail(oD);
	}
	
	public OrderDetail getOrderDetail() {
		return OrderDetails;
	}
	
	public void setOrderDetail(OrderDetail orderDetails) {
		OrderDetails = orderDetails;
	}
	
	public double getShippingWeight() {
		return shippingWeight;
	}
	
	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public double getPriceForQuantity() {
		return priceForQuantity;
	}
	
	public void setPriceForQuantity(double price) {
		this.priceForQuantity = price;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double itemWeight) {
		this.weight = itemWeight;
	}

}
