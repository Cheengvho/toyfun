package cn.cheen.dao;

import cn.cheen.daomain.User;

public interface UserDao {
	public User Login(String username, String password);
	public User FindUserByUsername(String username);
	public boolean DeleteUserByUsername(String username);
	public boolean UpdateUserByUsername(String username);
	public boolean AddUser(User user);
	
}
