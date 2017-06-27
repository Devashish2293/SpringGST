package com.SpringGST.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringGST.models.Item;


public class ItemMapper implements RowMapper<Item>{

	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		Item item = new Item();
		item.setItemId(rs.getString("item_id"));
	    item.setItemDescription(rs.getString("description")); 
	    item.setSKU(rs.getString("sku")); 
	    item.setItemType(rs.getString("item_type")); 
	    item.setHSN(rs.getString("hsn_sac")); 
	    item.setSellingPrice(rs.getDouble("sell_price")); 
	    item.setPurchasePrice(rs.getDouble("purchase_price")); 
	    item.setDiscount(rs.getDouble("discount")); 
	    item.setItemNotes(rs.getString("item_notes")); 
	    item.setUnitOfMeasurement(rs.getString("unit_of_measure")); 

		

		return item;
		// TODO Auto-generated method stub
		
	}

}
