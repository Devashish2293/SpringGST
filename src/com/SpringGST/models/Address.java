package com.SpringGST.models;

public class Address {

	private String address_id;
	private String state;
	private String address_line1;
	private String address_line2;
	private Long pincode;
	private	String city;
	private Long landlineNum;
	
	
	public String getAddress_id() {
		return address_id;
	}

	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
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

	public Long getLandlineNum() {
		return landlineNum;
	}

	public void setLandlineNum(Long landlineNum) {
		this.landlineNum = landlineNum;
	}

	public Address(String state, String address_line1,String address_line2, Long pincode, String city, String emailId, Long landlineNum) {
		super();
		this.state = state;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.pincode = pincode;
		this.city = city;
		this.landlineNum = landlineNum;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

}
