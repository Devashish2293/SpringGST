package com.SpringGST.models;

public class Individual extends AbstractCustomer{
	
	private String individualName;
	
	public Individual() {
		super();
	}

	public Individual(String customerId, Long mobileNum, Address address, String individualName) {
		super(customerId, mobileNum, address);
		this.individualName = individualName;
	}
	
	public String getIndividualName() {
		return individualName;
	}
	public void setIndividualName(String individualName) {
		this.individualName = individualName;
	}
}
