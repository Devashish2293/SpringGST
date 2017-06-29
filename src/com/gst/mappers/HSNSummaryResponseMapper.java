package com.gst.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gst.models.HSNSummaryResponse;

public class HSNSummaryResponseMapper implements RowMapper<HSNSummaryResponse> {

	public HSNSummaryResponse mapRow(ResultSet rs, int rowNum) throws SQLException {

		HSNSummaryResponse hsnSummaryResponse = new HSNSummaryResponse();
		hsnSummaryResponse.setHsn_list_id(rs.getString("hsn_list_id"));
		hsnSummaryResponse.setHsn_summary_id(rs.getString("hsn_summary_id"));
		hsnSummaryResponse.setNum(rs.getInt("num"));
		hsnSummaryResponse.setHsnsc(rs.getString("hsnsc"));
		hsnSummaryResponse.setDescription(rs.getString("description"));
		hsnSummaryResponse.setUOM(rs.getString("UOM"));
		hsnSummaryResponse.setQuantity(rs.getDouble("quantity"));
		hsnSummaryResponse.setTaxableAmount(rs.getDouble("taxableAmount"));
		hsnSummaryResponse.setIGSTAmount(rs.getDouble("IGSTAmount"));
		hsnSummaryResponse.setCGSTAmount(rs.getDouble("CGSTAmount"));
		hsnSummaryResponse.setSGSTAmount(rs.getDouble("SGSTAmount"));
		hsnSummaryResponse.setCessAmount(rs.getDouble("CessAmount"));
		hsnSummaryResponse.setSupplierInvoiceValue(rs.getDouble("supplierInvoiceValue"));
		// hsnSummaryData.setGoodsServices(rs.getString("goodsServices"));
		// hsnSummaryData.setNatureOfSupply(rs.getString("natureOfSupply"));

		return hsnSummaryResponse;
	}
}
