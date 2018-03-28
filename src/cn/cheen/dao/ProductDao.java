package cn.cheen.dao;

import java.util.Collection;


import cn.cheen.daomain.Product;

public interface ProductDao {
//	添加产品
	public boolean AddProduct(Product product);
//	查询产品
	public Product FindProduct(int id);
//	更新产品
	public boolean UpdateProduct(Product product);
//	删除产品
	public boolean DeleteProduct(int p_id);
//	按id，产品名，分类ID查询产品
	public Collection<Product> select(int id,String name,int c_id);
//	查询商品详情图
	public Collection<Product> FindProductImages(int id);
//	更新为热卖产品
	public boolean UpdateDiscountProduct(int id);
//	取消热卖
	public boolean CancelDiscountProduct(int id);
//	查询热卖产品
	public Collection<Product> FindDiscountProduct();

}
