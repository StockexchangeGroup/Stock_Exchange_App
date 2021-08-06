package com.cg.stockapp.service;

import java.util.List;

import com.cg.stockapp.dto.Company;

public interface ICompanyService {

	public Company addCompanyInfo(Company info);
	public	List<Company> getAllCompanyInfo();
	public	Company getCompanyDetails(String companyId);
	public Company updateCompanyInfo(Company info);
	public Company deleteCompanyInfo(String companyId);

}