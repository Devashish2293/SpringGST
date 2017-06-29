package com.SpringGST.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringGST.models.Address;
import com.SpringGST.models.Client;


public class ClientMapper implements RowMapper<Client> {

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.setClientId(rs.getString("client_id"));
		client.setClientGSTIN(rs.getString("client_gstin"));
		client.setBusinessName(rs.getString("business_name"));
		client.setMobileNum(rs.getLong("mobile"));
		client.setBusinessContactPerson(rs.getString("business_contact_person"));
		client.setIsBusiness(rs.getBoolean("is_business"));
		client.setBillingAddress(rs.getString("bill_address"));
		client.setShippingAddress(rs.getString("ship_address"));
		client.setIndividualName(rs.getString("individual_name"));
		return client;
	}
	

}
