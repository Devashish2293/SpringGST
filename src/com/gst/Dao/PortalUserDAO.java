package com.gst.Dao;

import java.util.List;

import javax.sql.DataSource;

import com.gst.models.PortalUser;

public interface PortalUserDAO {
	public void addPortalUser(PortalUser user);
	public List<PortalUser> getPortalUserList();
	public PortalUser getPortalUserFromId(String id);
	public boolean authenticate(String userName, String password);
}
