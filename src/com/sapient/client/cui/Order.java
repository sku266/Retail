package com.sapient.client.cui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class Order {
	private SimpleDateFormat date;
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
	
	public Order(){
		
	}
	
	public Order(SimpleDateFormat sdf, Status st, NewCustomer c, Payment p, List<OrderDetail> oD){
		this.setDate(sdf);
		this.setStatus(st);
		this.setCustomer(c);
		this.setPayment(p);
		this.setOrderdetail(oD);
	}
	
	public SimpleDateFormat getDate() {
		return date;
	}
	
	public void setDate(SimpleDateFormat date) {
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
			Item orderItem = orderObj.getItem();
			double tax = orderObj.taxStatus/100;
			double detailTax = (tax * orderItem.getPriceForQuantity() * orderObj.quantity);
			taxTotal += detailTax;
		}
		return Math.round(taxTotal*100.0)/100.0;
	}
	
	public double calcTotal(){
		double total = 0;
		for(OrderDetail orderObj : orderDetail){
			total += orderObj.calSubTotal();
		}
		return Math.round(total*100.0)/100.0;
	}
	
	public double calcTotalWeight(){
		double total = 0;
		for(OrderDetail orderObj : orderDetail){
			total += orderObj.calWeight();
		}
		return Math.round(total*100.0)/100.0;
	}
}
