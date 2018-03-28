package cn.cheen.dao;

import java.util.Collection;


import cn.cheen.daomain.Product;

public interface ProductDao {
//	��Ӳ�Ʒ
	public boolean AddProduct(Product product);
//	��ѯ��Ʒ
	public Product FindProduct(int id);
//	���²�Ʒ
	public boolean UpdateProduct(Product product);
//	ɾ����Ʒ
	public boolean DeleteProduct(int p_id);
//	��id����Ʒ��������ID��ѯ��Ʒ
	public Collection<Product> select(int id,String name,int c_id);
//	��ѯ��Ʒ����ͼ
	public Collection<Product> FindProductImages(int id);
//	����Ϊ������Ʒ
	public boolean UpdateDiscountProduct(int id);
//	ȡ������
	public boolean CancelDiscountProduct(int id);
//	��ѯ������Ʒ
	public Collection<Product> FindDiscountProduct();

}
