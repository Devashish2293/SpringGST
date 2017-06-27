package com.SpringGST.models;

import java.util.Date;
import java.util.List;

public class Invoice {

	private String invoiceId;
	private String businessId;
	private String clientId;
	private String invoiceItemId;
	private Date invoiceDate;
	private String natureOfInvoice;
	private String invoiceType;
	private String gstr1FilingStatus;
	private Date dueDate;
	private String placeOfSupply;
	private Double grandTotal;

	public Invoice(String invoiceId, Date invoiceDate, Date dueDate) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.dueDate = dueDate;
	}

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getInvoiceItemId() {
		return invoiceItemId;
	}

	public void setInvoiceItemId(String invoiceItemId) {
		this.invoiceItemId = invoiceItemId;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getNatureOfInvoice() {
		return natureOfInvoice;
	}

	public void setNatureOfInvoice(String natureOfInvoice) {
		this.natureOfInvoice = natureOfInvoice;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getGstr1FilingStatus() {
		return gstr1FilingStatus;
	}

	public void setGstr1FilingStatus(String gstr1FilingStatus) {
		this.gstr1FilingStatus = gstr1FilingStatus;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getPlaceOfSupply() {
		return placeOfSupply;
	}

	public void setPlaceOfSupply(String placeOfSupply) {
		this.placeOfSupply = placeOfSupply;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	
}
