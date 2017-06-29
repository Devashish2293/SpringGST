package com.gst.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gst.models.GSTRSummaryResponse;

public class GSTRSummaryResponseMapper implements RowMapper<GSTRSummaryResponse> {

	public GSTRSummaryResponse mapRow(ResultSet rs, int rowNum) throws SQLException {

		GSTRSummaryResponse gstrSummaryResponse = new GSTRSummaryResponse();
		gstrSummaryResponse.setGstr_list_id(rs.getString("gstr_list_id"));
		gstrSummaryResponse.setGstr_summary_id(rs.getString("gstr_summary_id"));
		gstrSummaryResponse.setReturn_section(rs.getString("return_section"));
		gstrSummaryResponse.setTotal_record(rs.getInt("total_record"));
		gstrSummaryResponse.setTotal_record_val(rs.getDouble("total_record_val"));
		gstrSummaryResponse.setTotal_igst(rs.getDouble("total_igst"));
		gstrSummaryResponse.setTotal_cgst(rs.getDouble("total_cgst"));
		gstrSummaryResponse.setTotal_sgst(rs.getDouble("total_sgst"));
		gstrSummaryResponse.setTotal_cess(rs.getDouble("total_cess"));
		gstrSummaryResponse.setTotal_tax(rs.getDouble("total_tax"));
//		gstrSummaryResponse.setCounterPartyResponse(rs.getArray("counterPartyResponse"));
//		gstrSummaryResponse.setStateCodeResponse(rs.getArray("stateCodeResponse"));

		return gstrSummaryResponse;
	}
}
