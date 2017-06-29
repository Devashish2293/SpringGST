package com.gst.models;

public class GSTRSummaryResponse {

	private String gstr_list_id;
	private String gstr_summary_id;
	private String return_section;
	private int total_record;
	private Double total_record_val;
	private Double total_igst;
	private Double total_cgst;
	private Double total_sgst;
	private Double total_cess;
	private Double total_tax;
	// private List<CounterPartyResponse> counterPartyResponse;
	// private List<StateCodeResponse> stateCodeResponse;

	public GSTRSummaryResponse() {
	}

	public String getGstr_list_id() {
		return gstr_list_id;
	}

	public void setGstr_list_id(String gstr_list_id) {
		this.gstr_list_id = gstr_list_id;
	}

	public String getGstr_summary_id() {
		return gstr_summary_id;
	}

	public void setGstr_summary_id(String gstr_summary_id) {
		this.gstr_summary_id = gstr_summary_id;
	}

	public String getReturn_section() {
		return return_section;
	}

	public void setReturn_section(String return_section) {
		this.return_section = return_section;
	}

	public int getTotal_record() {
		return total_record;
	}

	public void setTotal_record(int total_record) {
		this.total_record = total_record;
	}

	public Double getTotal_record_val() {
		return total_record_val;
	}

	public void setTotal_record_val(Double total_record_val) {
		this.total_record_val = total_record_val;
	}

	public Double getTotal_igst() {
		return total_igst;
	}

	public void setTotal_igst(Double total_igst) {
		this.total_igst = total_igst;
	}

	public Double getTotal_cgst() {
		return total_cgst;
	}

	public void setTotal_cgst(Double total_cgst) {
		this.total_cgst = total_cgst;
	}

	public Double getTotal_sgst() {
		return total_sgst;
	}

	public void setTotal_sgst(Double total_sgst) {
		this.total_sgst = total_sgst;
	}

	public Double getTotal_cess() {
		return total_cess;
	}

	public void setTotal_cess(Double total_cess) {
		this.total_cess = total_cess;
	}

	public Double getTotal_tax() {
		return total_tax;
	}

	public void setTotal_tax(Double total_tax) {
		this.total_tax = total_tax;
	}

	// public List<CounterPartyResponse> getCounterPartyResponse() {
	// return counterPartyResponse;
	// }
	//
	// public void setCounterPartyResponse(Array counterPartyResponse) {
	// this.counterPartyResponse = (List<CounterPartyResponse>)
	// counterPartyResponse;
	// }
	//
	// public List<StateCodeResponse> getStateCodeResponse() {
	// return stateCodeResponse;
	// }
	//
	// public void setStateCodeResponse(Array stateCodeResponse) {
	// this.stateCodeResponse = (List<StateCodeResponse>) stateCodeResponse;
	// }
}
