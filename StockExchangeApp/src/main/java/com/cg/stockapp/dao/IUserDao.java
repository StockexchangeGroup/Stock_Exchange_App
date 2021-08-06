package com.cg.stockapp.dao;

import com.cg.stockapp.dto.User;

public interface IUserDao {

	public User login(String username,String password);
	public User logout(User user);
	public User createUser(User user);
	public User removeUser(User user);
}
