package cn.cheen.daomain;

public class Orderitem {
	private int item_id;
	private int item_count;
	private double item_totalPrice;
	private int p_id;
	private String o_id;
	public Orderitem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orderitem(int item_id, int item_count, double item_totalPrice, int p_id, String o_id) {
		super();
		this.item_id = item_id;
		this.item_count = item_count;
		this.item_totalPrice = item_totalPrice;
		this.p_id = p_id;
		this.o_id = o_id;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getItem_count() {
		return item_count;
	}
	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}
	public double getItem_totalPrice() {
		return item_totalPrice;
	}
	public void setItem_totalPrice(double item_totalPrice) {
		this.item_totalPrice = item_totalPrice;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getO_id() {
		return o_id;
	}
	public void setO_id(String o_id) {
		this.o_id = o_id;
	}
	
	
}
