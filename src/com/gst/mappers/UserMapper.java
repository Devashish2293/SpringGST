package com.gst.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gst.models.Address;
import com.gst.models.Client;
import com.gst.models.PortalUser;

public class UserMapper implements RowMapper<PortalUser>{


	public PortalUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		PortalUser user = new PortalUser();
		user.setPortalUserId(rs.getString("portalUserId"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setEmail(rs.getString("email"));
		user.setMobileNum(rs.getLong("mobileNum"));
		user.setPassword(rs.getString("password"));
		
		return user;
	}

}
