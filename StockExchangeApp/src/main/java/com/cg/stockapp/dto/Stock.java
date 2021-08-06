package com.cg.stockapp.dto;
public class Stock  {
private int stockId;
	private String companyId;
	private String investorId;
	private String stockName;
	private int quantity;
	private String type;
	private double avgPrice;
	private int totalNoOfStocks;
	private double profitLoss;
	private String status;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}
	public int getTotalNoOfStocks() {
		return totalNoOfStocks;
	}
	public void setTotalNoOfStocks(int totalNoOfStocks) {
		this.totalNoOfStocks = totalNoOfStocks;
	}
	public double getProfitLoss() {
		return profitLoss;
	}
	public void setProfitLoss(double profitLoss) {
		this.profitLoss = profitLoss;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", companyId=" + companyId + ", investorId=" + investorId + ", stockName="
				+ stockName + ", quantity=" + quantity + ", type=" + type + ", avgPrice=" + avgPrice
				+ ", totalNoOfStocks=" + totalNoOfStocks + ", profitLoss=" + profitLoss + ", status=" + status + "]";
	}
	
	
}
