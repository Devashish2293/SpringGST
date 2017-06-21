package com.SpringGST.models;


public class Item {

	private Long sequence;
	private String itemDescription;
	private String SKU;
	private ItemType itemType;
	private String HSN;
	private Long quantity;
	private Double sellingPrice;
	private Double purchasePrice;
	private Double discount;
	private String itemNotes;
	private Double taxableValue;
	private Double cgstPercentage;
	private Double cgstAmount;
	private Double sgstPercentage;
	private Double sgstAmount;
	private Double igstPercentage;
	private Double igstAmount;
	private Double Total;
	private String unitOfMeasurement;
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public Long getSequence() {
		return sequence;
	}
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}
	public Double getIgstAmount() {
		return igstAmount;
	}
	public void setIgstAmount(Double igstAmount) {
		this.igstAmount = igstAmount;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	public String getHSN() {
		return HSN;
	}
	public void setHSN(String hSN) {
		HSN = hSN;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getItemNotes() {
		return itemNotes;
	}
	public void setItemNotes(String itemNotes) {
		this.itemNotes = itemNotes;
	}
	public Double getTaxableValue() {
		return taxableValue;
	}
	public void setTaxableValue(Double taxableValue) {
		this.taxableValue = taxableValue;
	}
	public Double getCgstPercentage() {
		return cgstPercentage;
	}
	public void setCgstPercentage(Double cgstPercentage) {
		this.cgstPercentage = cgstPercentage;
	}
	public Double getCgstAmount() {
		return cgstAmount;
	}
	public void setCgstAmount(Double cgstAmount) {
		this.cgstAmount = cgstAmount;
	}
	public Double getSgstPercentage() {
		return sgstPercentage;
	}
	public void setSgstPercentage(Double sgstPercentage) {
		this.sgstPercentage = sgstPercentage;
	}
	public Double getSgstAmount() {
		return sgstAmount;
	}
	public void setSgstAmount(Double sgstAmount) {
		this.sgstAmount = sgstAmount;
	}
	public Double getIgstPercentage() {
		return igstPercentage;
	}
	public void setIgstPercentage(Double igstPercentage) {
		this.igstPercentage = igstPercentage;
	}

	public Double getTotal() {
		return Total;
	}
	public void setTotal(Double total) {
		Total = total;
	}

}
