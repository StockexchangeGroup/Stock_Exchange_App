package com.cg.stockapp.dao;

import java.util.List;

import com.cg.stockapp.dto.Company;

public interface ICompanyDAO {

	public Company addCompanyInfo(Company info);
	public	List<Company> getAllCompanyInfo();
	public	Company getCompanyDetails(String companyId);
	public Company updateCompanyInfo(Company info);
	public Company deleteCompanyInfo(String companyId);

}