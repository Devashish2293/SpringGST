package com.gst.DaoImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.InvoiceItemDAO;
import com.gst.mappers.ClientMapper;
import com.gst.mappers.InvoiceItemMapper;
import com.gst.models.Client;
import com.gst.models.InvoiceItem;

public class InvoiceItemDAOImpl implements InvoiceItemDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate template) {
		this.jdbcTemplateObject = template;
	}

	
	public void addInvoiceItem(InvoiceItem invoiceItem) {
		// TODO Auto-generated method stub
		 String invoiceItemID = UUID.randomUUID().toString(); 
		    invoiceItem.setInvoiceItemId(invoiceItemID);
		 String SQL = "insert into invoice_item (invoice_item_id,item_id,invoice_id,quantity,total_price,cgst_percent,cgst_total,sgst_percent,sgst_total,"
		 		+ "igst_percent,igst_total,cess_percent,cess_total) values (?, ?,?, ?,?, ?,?, ?,?,?,?,?,?)";
	      if(jdbcTemplateObject == null)
	    	  System.out.println("object is null");
	    	  else
	    	jdbcTemplateObject.update( SQL ,invoiceItem.getInvoiceItemId() , invoiceItem.getItemId() , invoiceItem.getInvoiceId() , invoiceItem.getQuantity() , 
	    			invoiceItem.getTotalAmount() , invoiceItem.getCgstPercentage() , invoiceItem.getCgstAmount() , invoiceItem.getSgstPercentage() 
	    			, invoiceItem.getSgstAmount(), invoiceItem.getIgstPercentage() , invoiceItem.getIgstAmount() , invoiceItem.getCessPercentage() , invoiceItem.getCessAmount() );
		
	}

	
	public InvoiceItem getInvoiceItem(String id) {
		// TODO Auto-generated method stub
		String SQL = "select * from invoice_item where invoice_item_id = ?";
		InvoiceItem invoiceItem = this.jdbcTemplateObject.queryForObject(SQL, new Object[]{id},new InvoiceItemMapper());
		return invoiceItem;
	}

	
	public List<InvoiceItem> getInvoiceItemList() {
		// TODO Auto-generated method stub
		String SQL = "select * from invoice_item";
	      List <InvoiceItem> invoiceItemList = jdbcTemplateObject.query(SQL, new InvoiceItemMapper());
	      return invoiceItemList;
	}

}
