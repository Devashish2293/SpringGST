package com.gst.models;
public class UserBean {
	
	
	private Integer portal_user_id;
	
	private String portal_email;
	
	private String portal_mobile;
	
	private  String portal_password ;
	
	private  String portal_gstin ;
	
	private  Integer portal_group_id ;
	
	private  String portal_state ;

	public UserBean(Integer portal_user_id, String portal_email, String portal_mobile, String portal_password,
			String portal_gstin, Integer portal_group_id, String portal_state) {
		super();
		this.portal_user_id = portal_user_id;
		this.portal_email = portal_email;
		this.portal_mobile = portal_mobile;
		this.portal_password = portal_password;
		this.portal_gstin = portal_gstin;
		this.portal_group_id = portal_group_id;
		this.portal_state = portal_state;
	}

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPortal_user_id() {
		return portal_user_id;
	}

	public void setPortal_user_id(Integer portal_user_id) {
		this.portal_user_id = portal_user_id;
	}

	public String getPortal_email() {
		return portal_email;
	}

	public void setPortal_email(String portal_email) {
		this.portal_email = portal_email;
	}

	public String getPortal_mobile() {
		return portal_mobile;
	}

	public void setPortal_mobile(String portal_mobile) {
		this.portal_mobile = portal_mobile;
	}

	public String getPortal_password() {
		return portal_password;
	}

	public void setPortal_password(String portal_password) {
		this.portal_password = portal_password;
	}

	public String getPortal_gstin() {
		return portal_gstin;
	}

	public void setPortal_gstin(String portal_gstin) {
		this.portal_gstin = portal_gstin;
	}

	public Integer getPortal_group_id() {
		return portal_group_id;
	}

	public void setPortal_group_id(Integer portal_group_id) {
		this.portal_group_id = portal_group_id;
	}

	public String getPortal_state() {
		return portal_state;
	}

	public void setPortal_state(String portal_state) {
		this.portal_state = portal_state;
	}
	

}
