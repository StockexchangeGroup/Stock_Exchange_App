package com.cg.stockapp.dto;


public class Investor {

	private static final long serialVersionUID = 1L;

	private String investorId;
	private String investorName;
	private String email;
	private String password;
	private String mobileNo;
	private String gender;
	private BankAccount account;
	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Investor [investorId=" + investorId + ", investorName=" + investorName + ", email=" + email
				+ ", password=" + password + ", mobileNo=" + mobileNo + ", gender=" + gender + ", account=" + account
				+ "]";
	}

	
}
