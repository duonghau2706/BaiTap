package Buoi6_bai1.entity;

public class Orange extends Fruit{
	private double weight;
	private String vitamin;
		
	public Orange(String name, double price, int quantity, double weight, String vitamin) {
		super(name, price, quantity);
		this.weight = weight;
		this.vitamin = vitamin;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight() {
		this.weight = weight;
	}

	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}
	
}
