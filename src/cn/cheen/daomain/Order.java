package cn.cheen.daomain;

public class Order {
	private String id;
	private double totalPrice;
	private String time;
	private String city;
	private String name;
	private String phone;
	private String address;
	private String poscode;
	private int u_id;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String id, double totalPrice, String time, String city, String name, String phone, String address, String poscode, int u_id) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.time = time;
		this.city = city;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.poscode = poscode;
		this.u_id = u_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPoscode() {
		return poscode;
	}
	public void setPoscode(String poscode) {
		this.poscode = poscode;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	
	
}
