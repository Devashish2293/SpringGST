package com.SpringGST.FormatterImpl;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.SpringGST.Dao.ClientDAO;
import com.SpringGST.models.Client;


@Component
public class ClientFormatter implements Formatter<Client>{

	@Autowired
	private ClientDAO clientDAO;
	@Override
	public String print(Client client, Locale arg1) {
		// TODO Auto-generated method stub
		return client.getBusinessName();
	}

	@Override
	public Client parse(String clientId, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		
		return clientDAO.getClientFromId(clientId);
	}

}
