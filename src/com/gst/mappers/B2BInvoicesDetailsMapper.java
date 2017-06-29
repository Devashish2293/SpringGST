package com.gst.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gst.models.B2BInvoicesDetails;

public class B2BInvoicesDetailsMapper implements RowMapper<B2BInvoicesDetails> {

	public B2BInvoicesDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		B2BInvoicesDetails b2bInvoicesDetails = new B2BInvoicesDetails();
		b2bInvoicesDetails.setB2B_invoice_details_id(rs.getString("B2B_invoice_details_id"));
		b2bInvoicesDetails.setB2B_list_id(rs.getString("B2B_list_id"));
		b2bInvoicesDetails.setInvoice_status(rs.getString("invoice_status"));
		b2bInvoicesDetails.setUploaded_by(rs.getString("uploaded_by"));
		b2bInvoicesDetails.setSupplier_invoice_number(rs.getString("supplier_invoice_number"));
		b2bInvoicesDetails.setSupplier_invoice_date(rs.getString("supplier_invoice_date"));
		b2bInvoicesDetails.setSupplier_invoice_value(rs.getDouble("supplier_invoice_value"));
		b2bInvoicesDetails.setPlace_of_supply(rs.getString("Place_of_supply"));
		b2bInvoicesDetails.setReverse_charge(rs.getString("reverse_charge"));
		b2bInvoicesDetails.setEcom_operator(rs.getString("ecom_operator"));
		b2bInvoicesDetails.setInvoice_type(rs.getString("invoice_type"));
		b2bInvoicesDetails.setCounter_party_flag(rs.getString("counter_party_flag"));
		b2bInvoicesDetails.setOriginal_period(rs.getString("original_period"));

		return b2bInvoicesDetails;
	}
}
