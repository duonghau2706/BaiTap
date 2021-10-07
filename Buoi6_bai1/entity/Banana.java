package Buoi6_bai1.entity;

public class Banana extends Fruit{
	private double kali;
	private String vitamin;
	
	public Banana(String name, double price, int quantity, double kali, String vitamin) {
		super(name, price, quantity);
		this.kali = kali;
		this.vitamin = vitamin;
	}
	public double getKali() {
		return kali;
	}
	public void setKali() {
		this.kali = kali;
	}
	public String getVitamin() {
		return vitamin;
	}
	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}
}
