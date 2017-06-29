package com.gst.models;

public class B2BInvoicesResponse {
	
	private String B2B_list_id;
	private String B2B_invoices_id;
	private String ctin;
	private String GSTR2_counter_party_filing_status;

	public B2BInvoicesResponse() {
	}

	public String getB2B_list_id() {
		return B2B_list_id;
	}

	public void setB2B_list_id(String b2b_list_id) {
		B2B_list_id = b2b_list_id;
	}

	public String getB2B_invoices_id() {
		return B2B_invoices_id;
	}

	public void setB2B_invoices_id(String b2b_invoices_id) {
		B2B_invoices_id = b2b_invoices_id;
	}

	public String getCtin() {
		return ctin;
	}

	public void setCtin(String ctin) {
		this.ctin = ctin;
	}

	public String getGSTR2_counter_party_filing_status() {
		return GSTR2_counter_party_filing_status;
	}

	public void setGSTR2_counter_party_filing_status(String gSTR2_counter_party_filing_status) {
		GSTR2_counter_party_filing_status = gSTR2_counter_party_filing_status;
	}
}
