package cn.cheen.dao;

import java.util.Collection;

import cn.cheen.daomain.Order;
import cn.cheen.daomain.User;

public interface OrderDao {
	public boolean createOrder(User user,int p_id[]);
	public boolean deleteOrder(String id);
	public boolean updateOrder(String id);
	public Collection<Order> selectAllOrder(int u_id);
	public Order selectSingleOrder(String id);
}
