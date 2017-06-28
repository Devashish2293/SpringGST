package com.SpringGST.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringGST.models.InvoiceItem;

public class InvoiceItemMapper implements RowMapper<InvoiceItem> {

	@Override
	public InvoiceItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setInvoiceItemId(rs.getString("invoice_item_id"));
		invoiceItem.setItemId(rs.getString("item_id"));
		invoiceItem.setInvoiceId(rs.getString("invoice_id"));
		invoiceItem.setQuantity(rs.getDouble("quantity"));
		invoiceItem.setTotalAmount(rs.getDouble("total_price"));
		invoiceItem.setCgstPercentage(rs.getDouble("cgst_percent"));
		invoiceItem.setCgstAmount(rs.getDouble("cgst_total"));
		invoiceItem.setSgstPercentage(rs.getDouble("sgst_percent"));
		invoiceItem.setSgstAmount(rs.getDouble("sgst_total"));
		invoiceItem.setIgstPercentage(rs.getDouble("igst_percent"));
		invoiceItem.setIgstAmount(rs.getDouble("igst_total"));
		invoiceItem.setCessPercentage(rs.getDouble("cess_percent"));
		invoiceItem.setCessPercentage(rs.getDouble("cess_total"));
		return invoiceItem;
	}

}
