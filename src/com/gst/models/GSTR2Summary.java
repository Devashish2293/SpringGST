package com.gst.models;

public class GSTR2Summary {

	private String typeOfInvoice;
	private String noOfInvoices;
	private String taxableAmount;
	private String taxAmount;
	private String totalAmountInclTax;

	public GSTR2Summary(String typeOfInvoice, String noOfInvoices, String taxableAmount, String taxAmount,
			String totalAmountInclTax) {
		super();
		this.typeOfInvoice = typeOfInvoice;
		this.noOfInvoices = noOfInvoices;
		this.taxableAmount = taxableAmount;
		this.taxAmount = taxAmount;
		this.totalAmountInclTax = totalAmountInclTax;
	}

	public String getTypeOfInvoice() {
		return typeOfInvoice;
	}

	public void setTypeOfInvoice(String typeOfInvoice) {
		this.typeOfInvoice = typeOfInvoice;
	}

	public String getNoOfInvoices() {
		return noOfInvoices;
	}

	public void setNoOfInvoices(String noOfInvoices) {
		this.noOfInvoices = noOfInvoices;
	}

	public String getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public String getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTotalAmountInclTax() {
		return totalAmountInclTax;
	}

	public void setTotalAmountInclTax(String totalAmountInclTax) {
		this.totalAmountInclTax = totalAmountInclTax;
	}

}
