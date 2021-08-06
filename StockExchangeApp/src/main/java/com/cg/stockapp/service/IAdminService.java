package com.cg.stockapp.service;

import java.util.List;

import com.cg.stockapp.dto.Admin;

public interface IAdminService {
	
	public Admin addAdmin(Admin admin);
	public Admin viewAdmin(Admin admin);
	public Admin removeAdmin(Admin admin);
	public List<Admin> viewAllAdmin();
}
