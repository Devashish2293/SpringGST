package com.gst.models;
public class GroupsBean {

	private Integer portal_groups_id;
	
	private String portal_name;

	private Status portal_status;

	public GroupsBean(Integer portal_groups_id, String portal_name, Status portal_status) {
		super();
		this.portal_groups_id = portal_groups_id;
		this.portal_name = portal_name;
		this.portal_status = portal_status;
	}

	public GroupsBean(){}
	
	public Integer getPortal_groups_id() {
		return portal_groups_id;
	}

	public void setPortal_groups_id(Integer portal_groups_id) {
		this.portal_groups_id = portal_groups_id;
	}

	public String getPortal_name() {
		return portal_name;
	}

	public void setPortal_name(String portal_name) {
		this.portal_name = portal_name;
	}

	public Status getPortal_status() {
		return portal_status;
	}

	public void setPortal_status(Status portal_status) {
		this.portal_status = portal_status;
	}
	
}
