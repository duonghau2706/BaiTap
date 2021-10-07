package Buoi6_bai2.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi6_bai2.entity.Sach;

public class Inventory {
	static private List<Sach> inventory = new ArrayList<Sach>();
	static private int cout;
	
	private Inventory() {
	}
	
	static public List<Sach> getInstance(){
		return inventory;
	}
	
	static public boolean addToInventory(Sach sach) {
		cout++;
		inventory.add(sach);
		return true;
	}
	
	static public boolean isValid(int id) {
		for (Sach i : inventory) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	static public Sach getSach(int id) {
		return inventory.get(id-1);
	}
	
	static public int getSizeSach() {
		return cout;
	}
}
