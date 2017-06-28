package com.SpringGST.FormObjects;

import com.SpringGST.models.Client;
import com.SpringGST.models.Invoice;
import com.SpringGST.models.InvoiceItem;


public class InvoiceForm {
	
	private Invoice invoice;
	private Client client;
	private InvoiceItem invoiceItem;
	
	
	public InvoiceForm() {
		super();
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


	public InvoiceItem getInvoiceItem() {
		return invoiceItem;
	}


	public void setInvoiceItem(InvoiceItem invoiceItem) {
		this.invoiceItem = invoiceItem;
	}


	public InvoiceForm(Invoice invoice, Client client, InvoiceItem invoiceItem) {
		super();
		this.invoice = invoice;
		this.client = client;
		this.invoiceItem = invoiceItem;
	}
	
	

}
