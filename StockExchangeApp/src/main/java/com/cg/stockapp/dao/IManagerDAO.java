package com.cg.stockapp.dao;


import java.util.List;

import com.cg.stockapp.dto.Company;
import com.cg.stockapp.dto.Manager;

public interface IManagerDAO {
	
	boolean addManager(Manager info);
	public List<Manager> getAllManager();
	public Manager getManagerDetails(String managerId);
	public Manager updateManager(Manager info);
	public Manager deleteManager(String managerId);
	public Manager getManager(Company company);

}
