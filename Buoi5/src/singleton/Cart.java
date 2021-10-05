package singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entity.Fruit;

public class Cart {
	static Scanner sc = new Scanner(System.in);
	static private Map<Integer, Integer> cart = new HashMap<Integer, Integer>();
	
	private Cart() {
	}
	
	static public Map<Integer, Integer> getInstance() {
		return cart;
	}
	
	static public boolean addToCart(int id, int quantity) {
		//Kiem tra id
		if(Inventory.isValid(id) == false) {
			return false;
		}
		
		//Kiem tra so luong
		Fruit temp = Inventory.getFruit(id);
		if(temp.getQuantity() < quantity) {
			return false;
		}
		else {
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity - quantity);
		}
		
		//Them vao cart
		if (cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id, oldQuantity + quantity);
		}
		else {
			cart.put(id, quantity);
		}
		return true;
	}
}
