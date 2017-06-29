package com.gst.DaoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.GSTRSummaryDAO;
import com.gst.mappers.GSTRSummaryResponseMapper;
import com.gst.models.GSTRSummaryResponse;

public class GSTRSummaryDAOImpl implements GSTRSummaryDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate template) {
		this.jdbcTemplateObject = template;
	}

	@Override
	public String findIdByGstinRetPeriod(String gstin, String retPeriod){

		String query = "select gstr_summary_id from gstr_summary_request WHERE gstin = ? AND ret_period = ?";
		Object[] inputs = new Object[] { gstin, retPeriod };
		String id = jdbcTemplateObject.queryForObject(query, inputs, String.class);
		return id;
	}

	@Override
	public List<GSTRSummaryResponse> findGSTR1SummaryById(String id) {

		// String APIAction = "HSNSUM";
		String query = "select * from gstr_Summary_response WHERE gstr_summary_id  = ?";
		System.out.println("****query findGSTR1SummaryById**** : " + query);
		Object[] inputs = new Object[] { id };
		List<GSTRSummaryResponse> gstrSummaryResponses = (List<GSTRSummaryResponse>) jdbcTemplateObject.query(query,
				inputs, new GSTRSummaryResponseMapper());
		return gstrSummaryResponses;
	}
}
