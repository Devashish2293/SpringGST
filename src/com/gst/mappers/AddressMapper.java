package com.gst.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gst.models.Address;

public class AddressMapper implements RowMapper<Address> {
	
	public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setAddress_id(rs.getString("address_id"));
		address.setAddress_line1(rs.getString("address_line1"));
		address.setAddress_line2(rs.getString("address_line2"));
		address.setState(rs.getString("state"));
		address.setPincode(rs.getLong("pincode"));
		address.setCity(rs.getString("city"));
		address.setLandlineNum(rs.getLong("landline_number"));
		return address;
		
	
	}

}
