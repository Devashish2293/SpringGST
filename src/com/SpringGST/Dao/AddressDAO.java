package com.SpringGST.Dao;

import com.SpringGST.models.Address;

public interface AddressDAO {

	public String addAddress(Address address);
	public Address getAddress(String id);
}
