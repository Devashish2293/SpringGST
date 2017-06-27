package com.SpringGST.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringGST.models.Item;
import com.SpringGST.models.ItemType;

public class ItemMapper implements RowMapper<Item>{

	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		Item item = new Item();
		item.setSequence(rs.getLong("Sequence"));
		item.setItemDescription(rs.getString("ItemDescription"));
		item.setSKU(rs.getString("SKU"));
		item.setItemType(ItemType.valueOf((rs.getString("ItemType"))));
		item.setHSN(rs.getString("HSN"));
		item.setQuantity(rs.getLong("Quantity"));
		item.setSellingPrice(rs.getDouble("SellingPrice"));
		item.setPurchasePrice(rs.getDouble("PurchasePrice"));
		item.setDiscount(rs.getDouble("Discount"));
		item.setItemNotes(rs.getString("ItemNotes"));
		item.setTaxableValue(rs.getDouble("TaxableValue"));
		item.setCgstPercentage(rs.getDouble("CgstPercentage"));
		item.setCgstAmount(rs.getDouble("CgstAmount"));
		item.setSgstPercentage(rs.getDouble("SgstPercentage"));
		item.setSgstAmount(rs.getDouble("SgstAmount"));
		item.setIgstPercentage(rs.getDouble("IgstPercentage"));
		item.setIgstAmount(rs.getDouble("IgstAmount"));
		item.setTotal(rs.getDouble("Total"));
		item.setUnitOfMeasurement(rs.getString("UnitOfMeasurement"));
		

		return item;
		// TODO Auto-generated method stub
		
	}

}
