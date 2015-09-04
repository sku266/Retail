package com.sapient.client.cui;

import java.util.Date;
import java.util.List;
import java.util.Set;


public class Order {
	private Date date;
	private String status;
	private NewCustomer customer;
	private Payment payment;
	private List<OrderDetail> orderDetail;
	
	public static enum Status{
		Pending("Pending"),
		PaymentDeclined("PaymentDeclined"),
		AwaitingPayment("AwaitingPayment"),
		ReadyToShip("ReadyToShip"),
		PendingShippment("PendingShippment"),
		OnRoute("OnRoute"),
		Shipped("Shipped"),
		BackOrdered("BackOrdered"),
		OnReturnRoute("OnReturnRoute"),
		Returned("Returned");
		
		private String orderStatus;

		//Constructor
		Status(String statusString) {orderStatus = statusString;}
		
		public String getString() {return orderStatus;}
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status.getString(); 
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
	
	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}
	
	public void setOrderdetail(List<OrderDetail> orderdetail) {
		this.orderDetail = orderdetail;
	}
	
	public double calcTax(){
		double taxTotal = 0;
		for(OrderDetail orderObj : orderDetail){
			double detailTax = orderObj.taxStatus * orderObj.quantity;
			taxTotal += detailTax;
		}
		return taxTotal;
	}
	
	public double calcTotal(){
		double total = 0;
		for(OrderDetail orderObj : orderDetail){
			total += orderObj.calSubTotal();
		}
		return total;
	}
	
	public double calcTotalWeight(){
		double total = 0;
		for(OrderDetail orderObj : orderDetail){
			total += orderObj.calWeight();
		}
		return total;
	}
}
