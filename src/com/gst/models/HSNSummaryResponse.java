package com.gst.models;

public class HSNSummaryResponse {

	private String hsn_list_id;
	private String hsn_summary_id;
	private int num;
	private String hsnsc;
	private String description;
	private String UOM;
	private Double quantity;
	private Double supplierInvoiceValue;
	private Double taxableAmount;
	private Double IGSTAmount;
	private Double CGSTAmount;
	private Double SGSTAmount;
	private Double cessAmount;
	
	private String goodsServices;
	private String natureOfSupply;

	public HSNSummaryResponse() {
	}

	public String getHsn_list_id() {
		return hsn_list_id;
	}

	public void setHsn_list_id(String hsn_list_id) {
		this.hsn_list_id = hsn_list_id;
	}

	public String getHsn_summary_id() {
		return hsn_summary_id;
	}

	public void setHsn_summary_id(String hsn_summary_id) {
		this.hsn_summary_id = hsn_summary_id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getHsnsc() {
		return hsnsc;
	}

	public void setHsnsc(String hsnsc) {
		this.hsnsc = hsnsc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(Double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public Double getIGSTAmount() {
		return IGSTAmount;
	}

	public void setIGSTAmount(Double iGSTAmount) {
		IGSTAmount = iGSTAmount;
	}

	public Double getCGSTAmount() {
		return CGSTAmount;
	}

	public void setCGSTAmount(Double cGSTAmount) {
		CGSTAmount = cGSTAmount;
	}

	public Double getSGSTAmount() {
		return SGSTAmount;
	}

	public void setSGSTAmount(Double sGSTAmount) {
		SGSTAmount = sGSTAmount;
	}

	public Double getCessAmount() {
		return cessAmount;
	}

	public void setCessAmount(Double cessAmount) {
		this.cessAmount = cessAmount;
	}

	public Double getSupplierInvoiceValue() {
		return supplierInvoiceValue;
	}

	public void setSupplierInvoiceValue(Double supplierInvoiceValue) {
		this.supplierInvoiceValue = supplierInvoiceValue;
	}

	public String getGoodsServices() {
		return goodsServices;
	}

	public void setGoodsServices(String goodsServices) {
		this.goodsServices = goodsServices;
	}

	public String getNatureOfSupply() {
		return natureOfSupply;
	}

	public void setNatureOfSupply(String natureOfSupply) {
		this.natureOfSupply = natureOfSupply;
	}
}
