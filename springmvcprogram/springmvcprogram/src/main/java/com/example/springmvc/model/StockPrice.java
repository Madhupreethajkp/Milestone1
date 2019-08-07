package com.example.springmvc.model;

import java.sql.Time;
import java.util.Date;

public class StockPrice {
	private int companyCode;
	private int stockExchange;
	private double currentPrice;
	private Date stock_date;
	private Time time;
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Date getStock_date() {
		return stock_date;
	}
	public void setStock_date(Date stock_date) {
		this.stock_date = stock_date;
	}
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
	
	@Override
	public String toString() {
		return "StockPrice [companyCode=" + companyCode + ", stockExchange=" + stockExchange + ", currentPrice="
				+ currentPrice + ", stock_date=" + stock_date + ", time=" + time + "]";
	}

}
