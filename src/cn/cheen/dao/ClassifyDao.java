package cn.cheen.dao;

import java.util.Collection;

import cn.cheen.daomain.Classify;

public interface ClassifyDao {
	public boolean AddClassify(String name);
	public boolean DeleteClassify(int id);
	public Collection<Classify> FindClassify(int id);
	public boolean UpdateClassify(Classify classify);
	
	
	
}
