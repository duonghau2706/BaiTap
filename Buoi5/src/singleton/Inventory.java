package singleton;

import java.util.ArrayList;

import java.util.List;

import entity.Fruit;

public class Inventory {
	static private List<Fruit> inventory = new ArrayList<Fruit>();
	static private int cout;
	
	private Inventory() {
	}
	
	static public List<Fruit> getInstance(){
		return inventory;
	}
	
	//Them fruit vao inventory
	static public boolean addToInventory(Fruit fruit) {
		cout++;
		inventory.add(fruit);
		return true;
	}
	
	/**
	 * Kiem tra id co ton tai trong list ko?
	 * @param id
	 * @return boolean
	 */
	static public boolean isValid(int id) {
		for (Fruit i : inventory) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	/**
	 * Tra ve Fruit dua tren id
	 * @param id
	 * @return
	 */
	static public Fruit getFruit(int id) {
		return inventory.get(id-1);
	}
	
	static public int getSizeFruit() {
		return cout;
	}
}
