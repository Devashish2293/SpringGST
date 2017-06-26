package com.SpringGST.Dao;

import java.util.List;

import com.SpringGST.models.Customer;
import com.SpringGST.models.Item;

public interface CustomerDAO {
	
	public void addCustomer(Customer customer);
	public List<Customer> getCustomerList();
	public Customer getCustomerFromGSTIN(String GSTIN);

}
