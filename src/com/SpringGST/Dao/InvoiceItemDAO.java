package com.SpringGST.Dao;

import java.util.List;

import com.SpringGST.models.Address;
import com.SpringGST.models.InvoiceItem;

public interface InvoiceItemDAO {

	public void addInvoiceItem(InvoiceItem invoiceItem);
	public InvoiceItem getInvoiceItem(String id);
	public List<InvoiceItem>getInvoiceItemList();
}
