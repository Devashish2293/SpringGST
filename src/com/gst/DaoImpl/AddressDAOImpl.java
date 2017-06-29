package com.gst.DaoImpl;

import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.AddressDAO;
import com.gst.mappers.AddressMapper;
import com.gst.mappers.ClientMapper;
import com.gst.models.Address;
import com.gst.models.Client;

public class AddressDAOImpl implements AddressDAO {
	
private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate template) {  
	    this.jdbcTemplateObject = template;  
	}

	public String addAddress(Address address) {
		// TODO Auto-generated method stub
		 String addressID = UUID.randomUUID().toString(); 

		    address.setAddress_id(addressID); 
		 String SQL = "insert into address (address_id,address_line1,address_line2,state,pincode,city,landline_number) values (?, ?,?, ?,?, ?,?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	    	  else
	    	jdbcTemplateObject.update( SQL, address.getAddress_id(), address.getAddress_line1() , address.getAddress_line2() , address.getState() , address.getPincode(),address.getCity() ,address.getLandlineNum());
	      return addressID;
	}

	
	public Address getAddress(String id) {
		// TODO Auto-generated method stub
	
				String SQL = "select * from address where address_id = ?";
				Address address = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{id},new AddressMapper());
				return address;
	}
	
	
}
