package com.gst.Dao;

import java.util.List;

import com.gst.models.Client;
import com.gst.models.Item;

public interface ClientDAO {
	
	public void addClient(Client client);
	public List<Client> getClientList();
	public Client getClientFromId(String id);

}
