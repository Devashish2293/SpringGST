package com.gst.models;

public class ItemDetails {
	
	private String item_details_id;
	private String B2B_invoice_details_id;
	private int serial_no;
	private Double rate;
	private Double taxable_value;
	private Double igst_amount;
	private Double cgst_amount;
	private Double sgst_amount;
	private Double cess_amount;

	public ItemDetails() {
	}

	public String getItem_details_id() {
		return item_details_id;
	}

	public void setItem_details_id(String item_details_id) {
		this.item_details_id = item_details_id;
	}

	public String getB2B_invoice_details_id() {
		return B2B_invoice_details_id;
	}

	public void setB2B_invoice_details_id(String b2b_invoice_details_id) {
		B2B_invoice_details_id = b2b_invoice_details_id;
	}

	public int getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getTaxable_value() {
		return taxable_value;
	}

	public void setTaxable_value(Double taxable_value) {
		this.taxable_value = taxable_value;
	}

	public Double getIgst_amount() {
		return igst_amount;
	}

	public void setIgst_amount(Double igst_amount) {
		this.igst_amount = igst_amount;
	}

	public Double getCgst_amount() {
		return cgst_amount;
	}

	public void setCgst_amount(Double cgst_amount) {
		this.cgst_amount = cgst_amount;
	}

	public Double getSgst_amount() {
		return sgst_amount;
	}

	public void setSgst_amount(Double sgst_amount) {
		this.sgst_amount = sgst_amount;
	}

	public Double getCess_amount() {
		return cess_amount;
	}

	public void setCess_amount(Double cess_amount) {
		this.cess_amount = cess_amount;
	}
}
