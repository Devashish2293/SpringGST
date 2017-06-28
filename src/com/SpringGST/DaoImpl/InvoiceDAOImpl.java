package com.SpringGST.DaoImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringGST.Dao.InvoiceDAO;
import com.SpringGST.mappers.ClientMapper;
import com.SpringGST.mappers.InvoiceMapper;
import com.SpringGST.models.Client;
import com.SpringGST.models.Invoice;

public class InvoiceDAOImpl implements InvoiceDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate template) {
		this.jdbcTemplateObject = template;
	}

	@Override
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

	@Override
	public List<Invoice> getInvoiceList() {
		// TODO Auto-generated method stub
		String SQL = "select * from invoice";
	      List <Invoice> invoiceList = jdbcTemplateObject.query(SQL, new InvoiceMapper());
	      return invoiceList;
	}

	@Override
	public Invoice getInvoiceFromId(String id) {
		// TODO Auto-generated method stub
		String SQL = "select * from invoice where invoice_id = ?";
		Invoice invoice = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{id},new InvoiceMapper());
		return invoice;
	}

}
