package com.cg.stockapp.dto;

public class BankAccount {
	
	private String bankName;
	private String branchName;
	private long accountNo;
	private double balance;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [bankName=" + bankName + ", branchName=" + branchName + ", accountNo=" + accountNo
				+ ", balance=" + balance + "]";
	}
	
	
}
