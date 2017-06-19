package com.SpringGST.models;

public abstract class AbstractCustomer {

	private String customerId;
	private Long mobileNum;
	private Address address;
	
	public AbstractCustomer() {
		super();
	}

	public AbstractCustomer(String customerId, Long mobileNum, Address address) {
		super();
		this.customerId = customerId;
		this.mobileNum = mobileNum;
		this.address = address;
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
}
