package com.gst.DaoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gst.Dao.HSNSACDAO;
import com.gst.mappers.HSNSummaryResponseMapper;
import com.gst.models.HSNSummaryResponse;

public class HSNSACDAOImpl implements HSNSACDAO {

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate template) {
		this.jdbcTemplateObject = template;
	}

	@Override
	public String findIdByGstinRetPeriod(String gstin, String retPeriod) {

		String query = "select hsn_summary_id from hsn_summary_request WHERE gstin = ? AND ret_period = ?";
		Object[] inputs = new Object[] { gstin, retPeriod };
		String id = jdbcTemplateObject.queryForObject(query, inputs, String.class);
		return id;
	}

	@Override
	public List<HSNSummaryResponse> findGSTR1HSCSACSummaryById(String id) {

		// String APIAction = "HSNSUM";
		String query = "select * from hsn_summary_response WHERE hsn_summary_id = ?";
		System.out.println("****query findGSTR1HSCSACSummaryById**** : " + query);
		Object[] inputs = new Object[] { id };
		List<HSNSummaryResponse> hsnSummaryDatas = (List<HSNSummaryResponse>) jdbcTemplateObject.query(query,
				inputs, new HSNSummaryResponseMapper());
		return hsnSummaryDatas;
	}
}
