package com.SpringGST.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringGST.models.Address;
import com.SpringGST.models.Customer;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer = new Customer(new Address());
		customer.setGstIN(rs.getString("GSTIN"));
		customer.setBusinessName(rs.getString("BusinessName"));
		customer.setMobileNum(rs.getLong("MobileNum"));
		customer.setContactPerson(rs.getString("ContactPerson"));
		customer.setCustomerType(rs.getString("CustomerType"));
		customer.getAddress().setState(rs.getString("State"));
		customer.getAddress().setAddress(rs.getString("Address"));
		customer.getAddress().setPincode(rs.getLong("Pincode"));
		customer.getAddress().setCity(rs.getString("City"));
		customer.getAddress().setEmailId(rs.getString("EmailId"));
		customer.getAddress().setLandlineNum(rs.getLong("LandLineNum"));
		return customer;
	}
	

}
