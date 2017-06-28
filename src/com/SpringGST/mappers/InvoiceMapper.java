package com.SpringGST.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.SpringGST.models.Invoice;

public class InvoiceMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Invoice invoice = new Invoice();
		invoice.setInvoiceId(rs.getString("invoice_id"));
		invoice.setBusinessId(rs.getString("business_id"));
		invoice.setClientId(rs.getString("client_id"));
		invoice.setInvoiceDate(rs.getDate("invoice_date"));
		invoice.setDueDate(rs.getDate("due_date"));
		invoice.setPlaceOfSupply(rs.getString("place_of_supply"));
		invoice.setNatureOfInvoice(rs.getString("nature_of_invoice"));
		invoice.setInvoiceType(rs.getString("invoice_type"));
		invoice.setGstr1FilingStatus(rs.getString("gstr1_filing_status"));
		invoice.setGrandTotal(rs.getDouble("grand_total"));
		return invoice;
	}
	

}