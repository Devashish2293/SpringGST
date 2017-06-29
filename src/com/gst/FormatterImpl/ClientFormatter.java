package com.gst.FormatterImpl;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gst.Dao.ClientDAO;
import com.gst.models.Client;


@Component
@Service("clientFormatter")
public class ClientFormatter implements Formatter<Client>{

	@Autowired
	private ClientDAO clientDAO;
	
	public ClientFormatter() {
	}
	
	public String print(Client client, Locale arg1) {
		// TODO Auto-generated method stub
		return client.getBusinessName();
	}


	public Client parse(String clientId, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		
		return clientDAO.getClientFromId(clientId);
	}

}
