package com.gst.Dao;

import java.util.List;

import com.gst.models.Address;
import com.gst.models.InvoiceItem;

public interface InvoiceItemDAO {

	public void addInvoiceItem(InvoiceItem invoiceItem);
	public InvoiceItem getInvoiceItem(String id);
	public List<InvoiceItem>getInvoiceItemList();
}
