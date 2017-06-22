package com.SpringGST.DaoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringGST.Dao.CustomerDAO;
import com.SpringGST.mappers.CustomerMapper;
import com.SpringGST.mappers.ItemMapper;
import com.SpringGST.models.Customer;
import com.SpringGST.models.Item;

public class CustomerDAOImpl implements CustomerDAO{

private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate template) {  
	    this.jdbcTemplateObject = template;  
	}
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 String SQL = "insert into Customers (GSTIN, BusinessName,MobileNum,ContactPerson,CustomerType,State,Address,Pincode,City,EmailId,LandLineNum) values (?, ?,?, ?,?, ?,?, ?,?, ?,?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	    	  else
	    	jdbcTemplateObject.update( SQL, customer.getGstIN() ,customer.getBusinessName(),customer.getMobileNum(),customer.getContactPerson(),customer.getCustomerType(),customer.getAddress().getState(),customer.getAddress().getAddress(),customer.getAddress().getPincode(),customer.getAddress().getCity(),customer.getAddress().getEmailId(),customer.getAddress().getLandlineNum() );
	  //    System.out.println("Created Record Name = " + name + " Age = " + age);
	       
		
	}

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		String SQL = "select * from Customers";
	      List <Customer> customerList = jdbcTemplateObject.query(SQL, new CustomerMapper());
	      return customerList;
	}

}
