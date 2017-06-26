package com.SpringGST.FormatterImpl;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.SpringGST.Dao.CustomerDAO;
import com.SpringGST.models.Customer;

@Component
public class CustomerFormatter implements Formatter<Customer>{

	@Autowired
	private CustomerDAO customerDAO;
	@Override
	public String print(Customer customer, Locale arg1) {
		// TODO Auto-generated method stub
		return customer.getBusinessName();
	}

	@Override
	public Customer parse(String GSTIN, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		
		return customerDAO.getCustomerFromGSTIN(GSTIN);
	}

}
