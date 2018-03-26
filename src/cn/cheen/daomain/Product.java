package cn.cheen.daomain;

public class Product {
	private int id;
	private String name;
	private double oldprice;
	private double nowprice;
	private String image;
	private String description;
	private int discount;
	private String time;
	private int c_id;
	private String c_name;
	
	public Product() {
		
	}

	

	public Product(int id, String name, double oldprice, double nowprice, String image, String description,
			int discount, String time, int c_id, String c_name) {
		super();
		this.id = id;
		this.name = name;
		this.oldprice = oldprice;
		this.nowprice = nowprice;
		this.image = image;
		this.description = description;
		this.discount = discount;
		this.time = time;
		this.c_id = c_id;
		this.c_name = c_name;
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

	public double getOldprice() {
		return oldprice;
	}

	public void setOldprice(double oldprice) {
		this.oldprice = oldprice;
	}

	public double getNowprice() {
		return nowprice;
	}

	public void setNowprice(double nowprice) {
		this.nowprice = nowprice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	
	
}
