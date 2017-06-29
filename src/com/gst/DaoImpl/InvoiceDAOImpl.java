package com.gst.DaoImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.InvoiceDAO;
import com.gst.mappers.ClientMapper;
import com.gst.mappers.InvoiceMapper;
import com.gst.models.Client;
import com.gst.models.Invoice;

public class InvoiceDAOImpl implements InvoiceDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate template) {
		this.jdbcTemplateObject = template;
	}

	
	public String addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		String invoiceID = UUID.randomUUID().toString();       
		invoice.setInvoiceId(invoiceID);
		 String SQL = "insert into invoice (invoice_id, business_id,client_id,invoice_date,due_date,place_of_supply,nature_of_invoice,invoice_type,gstr1_filing_status,grand_total) values (?, ?,?, ?,?, ?,?, ?,? ,?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	    	  else
	    	jdbcTemplateObject.update( SQL, invoice.getInvoiceId() , invoice.getBusinessId() ,invoice.getClientId(), invoice.getInvoiceDate() , invoice.getDueDate() , invoice.getPlaceOfSupply(), invoice.getNatureOfInvoice(), invoice.getInvoiceType(),invoice.getGstr1FilingStatus(),invoice.getGrandTotal());
	  //    System.out.println("Created Record Name = " + name + " Age = " + age);
	      
	       return invoiceID;
	}

	
	public List<Invoice> getInvoiceList() {
		// TODO Auto-generated method stub
		String SQL = "select * from invoice";
	      List <Invoice> invoiceList = jdbcTemplateObject.query(SQL, new InvoiceMapper());
	      return invoiceList;
	}

	
	public Invoice getInvoiceFromId(String id) {
		// TODO Auto-generated method stub
		String SQL = "select * from invoice where invoice_id = ?";
		Invoice invoice = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{id},new InvoiceMapper());
		return invoice;
	}

}
