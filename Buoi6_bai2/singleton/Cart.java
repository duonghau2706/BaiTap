package Buoi6_bai2.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Buoi6_bai2.entity.Sach;

public class Cart {
	static Scanner sc = new Scanner(System.in);
	static private Map<Integer, Integer> cart = new HashMap<Integer, Integer>();
	
	private Cart() {
	}
	
	static public Map<Integer, Integer> getInstance() {
		return cart;
	}
	
	static public boolean addToCart(int id, int soLuong) {
		if(Inventory.isValid(id) == false) {
			return false;
		}
		
		Sach temp = Inventory.getSach(id);
		if(temp.getSoLuong() < soLuong) {
			return false;
		}
		else {
			int soLuongCu = temp.getSoLuong();
			temp.setSoLuong(soLuongCu - soLuong);
		}

		if (cart.containsKey(id)) {
			int soLuongCu = cart.get(id);
			cart.put(id, soLuongCu + soLuong);
		}
		else {
			cart.put(id, soLuong);
		}
		
		return true;
	}
}
