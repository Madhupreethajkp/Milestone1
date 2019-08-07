package com.example.springmvc.model;

import java.util.Date;

public class IPODetail {
	private int id;
	private String companyName;
	private int stockExchange_id;
	public int getStockExchange_id() {
		return stockExchange_id;
	}
	public void setStockExchange_id(int stockExchange_id) {
		this.stockExchange_id = stockExchange_id;
	}
	private double price;
	private int totalShares;
	private Date dateTime;
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPODetail [id=" + id + ", companyName=" + companyName + ", stockExchange_id=" + stockExchange_id
				+ ", price=" + price + ", totalShares=" + totalShares + ", dateTime=" + dateTime + ", remarks="
				+ remarks + "]";
	}

}
