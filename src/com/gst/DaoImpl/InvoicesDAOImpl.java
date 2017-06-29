package com.gst.DaoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.InvoicesDAO;
import com.gst.mappers.B2BInvoicesDetailsMapper;
import com.gst.mappers.B2BInvoicesResponseMapper;
import com.gst.mappers.ItemDetailsMapper;
import com.gst.models.B2BInvoicesDetails;
import com.gst.models.B2BInvoicesResponse;
import com.gst.models.ItemDetails;

public class InvoicesDAOImpl implements InvoicesDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate template) {
		this.jdbcTemplateObject = template;
	}

	@Override
	public String findIdByInvoicesRequest(String gstin, String retPeriod, String actionRequired, String ctin, String fromTime) {

		String query = "select B2B_invoices_id from B2B_invoices_request WHERE gstin = ? AND ret_period = ? AND action_required = ? AND ctin = ? AND from_time = ?";
		System.out.println("****query**findIdByInvoicesRequest** : " + query);
		Object[] inputs = new Object[] {gstin, retPeriod, actionRequired, ctin, fromTime};
		String b2bInvoicesId = jdbcTemplateObject.queryForObject(query, inputs, String.class);
		return b2bInvoicesId;
	}
	
	@Override
	public List<B2BInvoicesResponse> findAllB2BInvoicesResponseById(String b2bInvoicesId) {

		String query = "select * from B2B_invoices_response WHERE B2B_invoices_id = ?";
		System.out.println("****query**findAllB2BInvoicesResponseById** : " + query);
		Object[] inputs = new Object[] {b2bInvoicesId};
		List<B2BInvoicesResponse> b2bInvoicesResponses = jdbcTemplateObject.query(query, inputs, new B2BInvoicesResponseMapper());
		return b2bInvoicesResponses;
	}
	
	@Override
	public List<B2BInvoicesDetails> findAllB2BInvoicesDetailsByB2BInvoiceId(String b2bListId) {

		String query = "select * from B2B_invoice_details WHERE B2B_list_id = ?";
		System.out.println("****query**findAllB2BInvoicesDetailsByB2BInvoiceId** : " + query);
		Object[] inputs = new Object[] {b2bListId};
		List<B2BInvoicesDetails> b2bInvoicesDetails = jdbcTemplateObject.query(query, inputs, new B2BInvoicesDetailsMapper());
		return b2bInvoicesDetails;
	}
	
	@Override
	public List<ItemDetails> findAllItemDetailsByB2BInvoiceDetailsId(String b2bInvoiceDetailsId) {

		String query = "select * from item_details WHERE B2B_invoice_details_id = ?";
		System.out.println("****query**findAllItemDetailsByB2BInvoiceDetailsId** : " + query);
		Object[] inputs = new Object[] {b2bInvoiceDetailsId};
		List<ItemDetails> itemDetails = jdbcTemplateObject.query(query, inputs, new ItemDetailsMapper());
		return itemDetails;
	}
	
}
