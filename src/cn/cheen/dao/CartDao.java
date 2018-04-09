package cn.cheen.dao;

import java.util.Collection;

import cn.cheen.daomain.Product;
import cn.cheen.daomain.User;

public interface CartDao {
	public Collection<Product> FindCartProduct(String username);
	public boolean AddCartProduct(int u_id,String username,int p_id, double nowprice);
	public boolean DeletedCartProduct(int u_id,String username,int p_id);
	public boolean UpdateCartProduct(int u_id,String username,int p_id);
	public boolean CreateOrderFromCart(User user,int[] p_id);
	
}
