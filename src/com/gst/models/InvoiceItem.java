package com.gst.models;

public class InvoiceItem {
	
	private String invoiceItemId;
	private String itemId;
	private String invoiceId;
	private Double quantity;
	private Double totalAmount;
	private Double cgstPercentage;
	private Double cgstAmount;
	private Double sgstPercentage;
	private Double sgstAmount;
	private Double igstPercentage;
	private Double igstAmount;
	private Double cessPercentage;
	private Double cessAmount;
	public String getInvoiceItemId() {
		return invoiceItemId;
	}
	public void setInvoiceItemId(String invoiceItemId) {
		this.invoiceItemId = invoiceItemId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getCgstPercentage() {
		return cgstPercentage;
	}
	public void setCgstPercentage(Double cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}
	public Double getCgstAmount() {
		return cgstAmount;
	}
	public void setCgstAmount(Double cgstAmount) {
		this.cgstAmount = cgstAmount;
	}
	public Double getSgstPercentage() {
		return sgstPercentage;
	}
	public void setSgstPercentage(Double sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}
	public Double getSgstAmount() {
		return sgstAmount;
	}
	public void setSgstAmount(Double sgstAmount) {
		this.sgstAmount = sgstAmount;
	}
	public Double getIgstPercentage() {
		return igstPercentage;
	}
	public void setIgstPercentage(Double igstPercentage) {
		this.igstPercentage = igstPercentage;
	}
	public Double getIgstAmount() {
		return igstAmount;
	}
	public void setIgstAmount(Double igstAmount) {
		this.igstAmount = igstAmount;
	}
	public Double getCessPercentage() {
		return cessPercentage;
	}
	public void setCessPercentage(Double cessPercentage) {
		this.cessPercentage = cessPercentage;
	}
	public Double getCessAmount() {
		return cessAmount;
	}
	public void setCessAmount(Double cessAmount) {
		this.cessAmount = cessAmount;
	}
	

}
