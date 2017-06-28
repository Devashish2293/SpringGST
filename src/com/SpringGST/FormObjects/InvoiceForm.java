package com.SpringGST.FormObjects;

import com.SpringGST.models.Client;
import com.SpringGST.models.Invoice;
import com.SpringGST.models.InvoiceItem;


public class InvoiceForm {
	
	private Invoice invoice;
	private Client client;
	private InvoiceItem item;
	
	
	public InvoiceForm() {
		super();
	}
	
	public InvoiceForm(Invoice invoice, Client client, InvoiceItem item) {
		super();
		this.invoice = invoice;
		this.client = client;
		this.item = item;
	}

	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	public InvoiceItem getItem() {
		return item;
	}

	public void setItem(InvoiceItem item) {
		this.item = item;
	}

}
