package com.SpringGST.models;

public class Business extends AbstractCustomer {
	
	private String businessName;
	private String contactPerson;
	private String gstIN;

	public Business(String businessName) {
		this.businessName = businessName;
	}

	public Business(String customerId, Long mobileNum, Address address, String businessName, String contactPerson,
			String gstIN) {
		super(customerId, mobileNum, address);
		this.businessName = businessName;
		this.contactPerson = contactPerson;
		this.gstIN = gstIN;
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
