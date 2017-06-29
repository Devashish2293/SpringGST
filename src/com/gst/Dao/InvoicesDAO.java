package com.gst.Dao;

import java.util.List;

import com.gst.models.B2BInvoicesDetails;
import com.gst.models.B2BInvoicesResponse;
import com.gst.models.ItemDetails;

public interface InvoicesDAO {

	public String findIdByInvoicesRequest(String gstin, String retPeriod, String actionRequired, String ctin, String fromTime);

	public List<B2BInvoicesResponse> findAllB2BInvoicesResponseById(String b2bInvoicesId);

	public List<B2BInvoicesDetails> findAllB2BInvoicesDetailsByB2BInvoiceId(String b2bListId);

	public List<ItemDetails> findAllItemDetailsByB2BInvoiceDetailsId(String b2bInvoiceDetailsId);
}