package com.SpringGST.Dao;

import java.util.List;

import com.SpringGST.models.Client;
import com.SpringGST.models.Invoice;

public interface InvoiceDAO {

	public String addInvoice(Invoice invoice);
	public List<Invoice> getInvoiceList();
	public Invoice getInvoiceFromId(String id);
}