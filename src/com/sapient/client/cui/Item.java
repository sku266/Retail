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
