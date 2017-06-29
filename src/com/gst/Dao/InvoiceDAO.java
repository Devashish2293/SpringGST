package com.gst.Dao;

import java.util.List;

import com.gst.models.Client;
import com.gst.models.Invoice;

public interface InvoiceDAO {

	public String addInvoice(Invoice invoice);
	public List<Invoice> getInvoiceList();
	public Invoice getInvoiceFromId(String id);
}