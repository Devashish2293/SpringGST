package com.gst.models;

public class Client {

	private String clientId;
	private String clientGSTIN;
	private String businessName;
	private String billingAddress;
	private String shippingAddress;
	private Boolean isBusiness;
	private String individualName;
	private String businessContactPerson;
	private Long mobileNum;
	public Client(String businessName) {
		// TODO Auto-generated constructor stub
		this.businessName = businessName;
	}
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientGSTIN() {
		return clientGSTIN;
	}
	public void setClientGSTIN(String clientGSTIN) {
		this.clientGSTIN = clientGSTIN;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
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
	public Boolean getIsBusiness() {
		return isBusiness;
	}
	public void setIsBusiness(Boolean isBusiness) {
		this.isBusiness = isBusiness;
	}
	public String getIndividualName() {
		return individualName;
	}
	public void setIndividualName(String individualName) {
		this.individualName = individualName;
	}
	public String getBusinessContactPerson() {
		return businessContactPerson;
	}
	public void setBusinessContactPerson(String businessContactPerson) {
		this.businessContactPerson = businessContactPerson;
	}
	public Long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}
	
}
