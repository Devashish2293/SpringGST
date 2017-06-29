package com.gst.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gst.models.B2BInvoicesResponse;

public class B2BInvoicesResponseMapper implements RowMapper<B2BInvoicesResponse> {

	public B2BInvoicesResponse mapRow(ResultSet rs, int rowNum) throws SQLException {

		B2BInvoicesResponse b2bInvoicesResponse = new B2BInvoicesResponse();
		b2bInvoicesResponse.setB2B_list_id(rs.getString("B2B_list_id"));
		b2bInvoicesResponse.setB2B_invoices_id(rs.getString("B2B_invoices_id"));
		b2bInvoicesResponse.setCtin(rs.getString("ctin"));
		b2bInvoicesResponse.setGSTR2_counter_party_filing_status(rs.getString("GSTR2_counter_party_filing_status"));

		return b2bInvoicesResponse;
	}
}
