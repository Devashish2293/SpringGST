package com.gst.models;

public class ReconciledData {

	private String totaltransactions;
	private String totalMatches;
	private String pendingReconciliation;
	private String totalIGST;
	private String totalSGST;
	private String totalCGST;
	private String totalValue;
	
	public ReconciledData(String totaltransactions, String totalMatches, String pendingReconciliation, String totalIGST, 
			String totalSGST, String totalCGST, String totalValue) {
		super();
		this.totaltransactions = totaltransactions;
		this.totalMatches = totalMatches;
		this.pendingReconciliation = pendingReconciliation;
		this.totalIGST = totalIGST;
		this.totalSGST = totalSGST;
		this.totalCGST = totalCGST;
		this.totalValue = totalValue;
	}
	

	public String getTotaltransactions() {
		return totaltransactions;
	}
	public void setTotaltransactions(String totaltransactions) {
		this.totaltransactions = totaltransactions;
	}
	public String getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(String totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getPendingReconciliation() {
		return pendingReconciliation;
	}
	public void setPendingReconciliation(String pendingReconciliation) {
		this.pendingReconciliation = pendingReconciliation;
	}
	public String getTotalIGST() {
		return totalIGST;
	}
	public void setTotalIGST(String totalIGST) {
		this.totalIGST = totalIGST;
	}
	public String getTotalSGST() {
		return totalSGST;
	}
	public void setTotalSGST(String totalSGST) {
		this.totalSGST = totalSGST;
	}
	public String getTotalCGST() {
		return totalCGST;
	}
	public void setTotalCGST(String totalCGST) {
		this.totalCGST = totalCGST;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
}
