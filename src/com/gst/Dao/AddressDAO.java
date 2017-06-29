package com.gst.Dao;

import com.gst.models.Address;

public interface AddressDAO {

	public String addAddress(Address address);
	public Address getAddress(String id);
}
