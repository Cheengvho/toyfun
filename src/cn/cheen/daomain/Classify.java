package cn.cheen.daomain;

public class Classify {
	int id;
	String name;
	
	public Classify() {
		// TODO Auto-generated constructor stub
	}
	
	public Classify(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
