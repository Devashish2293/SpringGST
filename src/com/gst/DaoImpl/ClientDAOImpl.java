package com.gst.DaoImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.ClientDAO;
import com.gst.mappers.ClientMapper;
import com.gst.mappers.ItemMapper;
import com.gst.models.Client;
import com.gst.models.Item;

public class ClientDAOImpl implements ClientDAO{

private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate template) {  
	    this.jdbcTemplateObject = template;  
	}
	
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		 String clientID = UUID.randomUUID().toString(); 
		    client.setClientId(clientID); 
		 String SQL = "insert into client (client_id, client_gstin,business_name,bill_address,ship_address,is_business,individual_name,business_contact_person,mobile) values (?, ?,?, ?,?, ?,?, ?,?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	    	  else
	    	jdbcTemplateObject.update( SQL, client.getClientId() ,client.getClientGSTIN(),client.getBusinessName(),client.getBillingAddress(),client.getShippingAddress(),client.getIsBusiness(),client.getBusinessName(),client.getBusinessContactPerson(),client.getMobileNum() );
	  //    System.out.println("Created Record Name = " + name + " Age = " + age);
	       
		
	}

	
	public Client getClientFromId(String clientId) {
		// TODO Auto-generated method stub
		String SQL = "select * from client where client_id = ?";
		Client client = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{clientId},new ClientMapper());
		return client;
	}
	
	public List<Client> getClientList() {
		// TODO Auto-generated method stub
		String SQL = "select * from client";
	      List <Client> clientList = jdbcTemplateObject.query(SQL, new ClientMapper());
	      return clientList;
	}

}
