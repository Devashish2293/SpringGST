package com.SpringGST.models;

import java.util.Date;
import java.util.List;

public class Invoice {

	private String invoiceId;
	private Date invoiceDate;
	private String reference;
	private Date dueDate;
	private Customer customer;
	private String gstIN;
	private String placeOfSupply;
	private String billingAddress;

	private String shippingAddress;
	private Double grandTotal;
	private Double totalInvoiceValue;
	private List<Item> itemList;
	
	public Invoice(String invoiceId, Date invoiceDate, Date dueDate, Customer customer, Double totalInvoiceValue) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.dueDate = dueDate;
		this.customer = customer;
		this.totalInvoiceValue = totalInvoiceValue;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Double getTotalInvoiceValue() {
		return totalInvoiceValue;
	}
	public void setTotalInvoiceValue(Double totalInvoiceValue) {
		this.totalInvoiceValue = totalInvoiceValue;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getPlaceOfSupply() {
		return placeOfSupply;
	}
	public void setPlaceOfSupply(String placeOfSupply) {
		this.placeOfSupply = placeOfSupply;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public String getGstIN() {
		return gstIN;
	}
	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}
	
	
}
