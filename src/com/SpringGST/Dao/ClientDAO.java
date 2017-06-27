package com.SpringGST.Dao;

import java.util.List;

import com.SpringGST.models.Client;
import com.SpringGST.models.Item;

public interface ClientDAO {
	
	public void addClient(Client client);
	public List<Client> getClientList();
	public Client getClientFromId(String id);

}
