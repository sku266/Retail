package com.sapient.client.cui;

import java.util.Date;

public class Order {
	private Date date;
	private String status;
	private NewCustomer customer;
	private Payment payment;
	private OrderDetail orderdetail;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public NewCustomer getCustomer() {
		return customer;
	}
	
	public void setCustomer(NewCustomer customer) {
		this.customer = customer;
	}
	
	public Payment getPayment() {
		return payment;
	}
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public OrderDetail getOrderdetail() {
		return orderdetail;
	}
	
	public void setOrderdetail(OrderDetail orderdetail) {
		this.orderdetail = orderdetail;
	}
	
	public double calcTax(){
		return 0;
	}
	
	public double calcTotal(){
		return 0;
	}
	
	public double calcTotalWeight(){
		return 0;
	}
}
