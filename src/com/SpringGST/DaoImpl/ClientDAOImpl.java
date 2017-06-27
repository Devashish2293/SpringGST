package com.SpringGST.DaoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringGST.Dao.ClientDAO;
import com.SpringGST.mappers.ClientMapper;
import com.SpringGST.mappers.ItemMapper;
import com.SpringGST.models.Client;
import com.SpringGST.models.Item;

public class ClientDAOImpl implements ClientDAO{

private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate template) {  
	    this.jdbcTemplateObject = template;  
	}
	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		 String SQL = "insert into client (client_id, client_gstin,business_name,bill_address,ship_address,is_business,individual_name,business_contact_person,mobile) values (?, ?,?, ?,?, ?,?, ?,?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	    	  else
	    	jdbcTemplateObject.update( SQL, client.getClientId() ,client.getClientGSTIN(),client.getBusinessName(),client.getBillingAddress(),client.getShippingAddress(),client.getIsBusiness(),client.getIndividualName(),client.getBusinessContactPerson(),client.getMobileNum() );
	  //    System.out.println("Created Record Name = " + name + " Age = " + age);
	       
		
	}

	@Override
	public Client getClientFromId(String clientId) {
		// TODO Auto-generated method stub
		String SQL = "select * from client where client_id = ?";
		Client client = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{clientId},new ClientMapper());
		return client;
	}
	@Override
	public List<Client> getClientList() {
		// TODO Auto-generated method stub
		String SQL = "select * from client";
	      List <Client> clientList = jdbcTemplateObject.query(SQL, new ClientMapper());
	      return clientList;
	}

}
