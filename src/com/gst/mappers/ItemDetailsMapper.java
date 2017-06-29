package com.gst.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gst.models.ItemDetails;

public class ItemDetailsMapper implements RowMapper<ItemDetails> {

	public ItemDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		ItemDetails itemDetails = new ItemDetails();
		itemDetails.setItem_details_id(rs.getString("item_details_id"));
		itemDetails.setB2B_invoice_details_id(rs.getString("B2B_invoice_details_id"));
		itemDetails.setSerial_no(rs.getInt("serial_no"));
		itemDetails.setRate(rs.getDouble("rate"));
		itemDetails.setTaxable_value(rs.getDouble("taxable_value"));
		itemDetails.setIgst_amount(rs.getDouble("igst_amount"));
		itemDetails.setCgst_amount(rs.getDouble("cgst_amount"));
		itemDetails.setSgst_amount(rs.getDouble("sgst_amount"));
		itemDetails.setCess_amount(rs.getDouble("cess_amount"));

		return itemDetails;
	}
}
