package com.cg.stockapp.dto;


public class Company {

	private static final long serialVersionUID = 1L;
	private String companyId;
	private String companyName;
	private Manager manager;
	private int noOfStocks;
	private double stockPrice;
	private double percentageChange;
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public int getNoOfStocks() {
		return noOfStocks;
	}
	public void setNoOfStocks(int noOfStocks) {
		this.noOfStocks = noOfStocks;
	}
	public double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public double getPercentageChange() {
		return percentageChange;
	}
	public void setPercentageChange(double percentageChange) {
		this.percentageChange = percentageChange;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", manager=" + manager
				+ ", noOfStocks=" + noOfStocks + ", stockPrice=" + stockPrice + ", percentageChange=" + percentageChange
				+ "]";
	}	
	
	
}
