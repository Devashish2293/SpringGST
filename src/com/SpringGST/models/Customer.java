package com.SpringGST.models;

public class Customer {

	private String customerId;
	private Long mobileNum;
	private Address address;
	private String businessName;
	private String contactPerson;
	private String gstIN;
	private String CustomerType;
	
	
	public Customer() {
		super();
	}

	public Customer(String businessName) {
		super();
		this.businessName = businessName;
	}
	
	public Customer(Address address2) {
		// TODO Auto-generated constructor stub
		this.address = address2;
	}

	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getGstIN() {
		return gstIN;
	}
	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}

	
}
