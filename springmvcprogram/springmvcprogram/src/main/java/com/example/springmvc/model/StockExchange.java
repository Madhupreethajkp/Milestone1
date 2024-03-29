package com.example.springmvc.model;

public class StockExchange {
	private int id;
	private String stockexchange_name;
	public String getStockexchange_name() {
		return stockexchange_name;
	}
	public void setStockexchange_name(String stockexchange_name) {
		this.stockexchange_name = stockexchange_name;
	}
	private String brief;
	private String contactAddress;
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stockexchange_name=" + stockexchange_name + ", brief=" + brief
				+ ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
	}

}
