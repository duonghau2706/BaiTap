package Buoi6_bai1.entity;

import Buoi6_bai1.singleton.Inventory;

abstract public class Fruit {
	private int id;
	private String name;
	private double price;
	private int quantity;
	static private int count;
	
	abstract public String getVitamin();
	
	public Fruit(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.id = count + 1;
		count = count + 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void getPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// nguoi ban bo sung so luong vao kho
	public boolean addToQuantity(int id, int quantity) {
		if(Inventory.isValid(id)) {
			this.quantity += quantity;
			return true;
		}
		return false;
	}
}
