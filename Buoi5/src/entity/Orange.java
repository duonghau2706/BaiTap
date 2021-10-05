package entity;

public class Orange extends Fruit{
	private double weight;
		
	public Orange(String name, double price, int quantity, double weight) {
		super(name, price, quantity);
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight() {
		this.weight = weight;
	}
}
