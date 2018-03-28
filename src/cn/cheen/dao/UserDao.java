package cn.cheen.dao;

import java.util.Collection;

import cn.cheen.daomain.User;

public interface UserDao {
	public User Login(String username, String password);
	public User FindUserByUsername(String username);
	public Collection<User> FindAllUsers(String likeusername);
	public boolean DeleteUserByUsername(String username);
	public boolean UpdateUserByUsername(User user);
	public boolean AddUser(User user);
	public boolean UpdatePasswordByAdmin(String username,String newpassword);
	
}
