package com.gst.FormObjects;

import com.gst.models.Address;
import com.gst.models.Client;

public class ClientForm {

	private Client client;
	private Address address;
	
	public ClientForm() {
		super();
	}
	public ClientForm(Client client, Address address) {
		super();
		this.client = client;
		this.address = address;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
