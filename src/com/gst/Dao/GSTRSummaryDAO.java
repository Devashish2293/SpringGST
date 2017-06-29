package com.gst.Dao;

import java.util.List;

import com.gst.models.GSTRSummaryResponse;

public interface GSTRSummaryDAO {

	public String findIdByGstinRetPeriod(String gstin, String retPeriod);

	public List<GSTRSummaryResponse> findGSTR1SummaryById(String id);
}
