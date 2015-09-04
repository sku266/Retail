/**
 * 
 */
package com.sapient.client.cui;

/**
 * @author sku266
 *
 */
public class NewCustomer {
	private String name;
	private String address;
	private Order orderRef = new Order();
	
	public Order getOrderRef() {
		return orderRef;
	}

	public void setOrderRef(Order orderRef) {
		this.orderRef = orderRef;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
