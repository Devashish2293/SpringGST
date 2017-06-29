package com.gst.Dao;

import java.util.List;

import com.gst.models.HSNSummaryResponse;

public interface HSNSACDAO {
	
	public String findIdByGstinRetPeriod(String gstin, String retPeriod);

	public List<HSNSummaryResponse> findGSTR1HSCSACSummaryById(String id);
}
