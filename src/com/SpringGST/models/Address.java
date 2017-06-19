package com.SpringGST.models;

public class Address {

	private String state;
	private String address;
	private Long pincode;
	private	String city;
	private String emailId;
	private Long landlineNum;
	
	public Address(String state, String address, Long pincode, String city, String emailId, Long landlineNum) {
		super();
		this.state = state;
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.emailId = emailId;
		this.landlineNum = landlineNum;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getLandlineNum() {
		return landlineNum;
	}
	public void setLandlineNum(Long landlineNum) {
		this.landlineNum = landlineNum;
	}
}
