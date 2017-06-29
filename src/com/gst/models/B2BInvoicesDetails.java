package com.gst.models;

public class B2BInvoicesDetails {
	
	private String B2B_invoice_details_id;
	private String B2B_list_id;
	private String invoice_status;
	private String uploaded_by;
	private String supplier_invoice_number;
	private String supplier_invoice_date;
	private Double supplier_invoice_value;
	private String Place_of_supply;
	private String reverse_charge;
	private String ecom_operator;
	private String invoice_type;
	private String counter_party_flag;
	private String original_period;

	public B2BInvoicesDetails() {
	}

	public String getB2B_invoice_details_id() {
		return B2B_invoice_details_id;
	}

	public void setB2B_invoice_details_id(String b2b_invoice_details_id) {
		B2B_invoice_details_id = b2b_invoice_details_id;
	}

	public String getB2B_list_id() {
		return B2B_list_id;
	}

	public void setB2B_list_id(String b2b_list_id) {
		B2B_list_id = b2b_list_id;
	}

	public String getInvoice_status() {
		return invoice_status;
	}

	public void setInvoice_status(String invoice_status) {
		this.invoice_status = invoice_status;
	}

	public String getUploaded_by() {
		return uploaded_by;
	}

	public void setUploaded_by(String uploaded_by) {
		this.uploaded_by = uploaded_by;
	}

	public String getSupplier_invoice_number() {
		return supplier_invoice_number;
	}

	public void setSupplier_invoice_number(String supplier_invoice_number) {
		this.supplier_invoice_number = supplier_invoice_number;
	}

	public String getSupplier_invoice_date() {
		return supplier_invoice_date;
	}

	public void setSupplier_invoice_date(String supplier_invoice_date) {
		this.supplier_invoice_date = supplier_invoice_date;
	}

	public Double getSupplier_invoice_value() {
		return supplier_invoice_value;
	}

	public void setSupplier_invoice_value(Double supplier_invoice_value) {
		this.supplier_invoice_value = supplier_invoice_value;
	}

	public String getPlace_of_supply() {
		return Place_of_supply;
	}

	public void setPlace_of_supply(String place_of_supply) {
		Place_of_supply = place_of_supply;
	}

	public String getReverse_charge() {
		return reverse_charge;
	}

	public void setReverse_charge(String reverse_charge) {
		this.reverse_charge = reverse_charge;
	}

	public String getEcom_operator() {
		return ecom_operator;
	}

	public void setEcom_operator(String ecom_operator) {
		this.ecom_operator = ecom_operator;
	}

	public String getInvoice_type() {
		return invoice_type;
	}

	public void setInvoice_type(String invoice_type) {
		this.invoice_type = invoice_type;
	}

	public String getCounter_party_flag() {
		return counter_party_flag;
	}

	public void setCounter_party_flag(String counter_party_flag) {
		this.counter_party_flag = counter_party_flag;
	}

	public String getOriginal_period() {
		return original_period;
	}

	public void setOriginal_period(String original_period) {
		this.original_period = original_period;
	}
}
