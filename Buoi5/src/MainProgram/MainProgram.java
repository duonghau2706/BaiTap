package MainProgram;

import java.util.Scanner;

import entity.Apple;
import entity.Banana;
import entity.Fruit;
import entity.Orange;
import singleton.Cart;
import singleton.Inventory;

public class MainProgram {

	public static void main(String[] args) {
		
		Inventory.addToInventory(new Apple("Tao my", 100, 5, 20));
		Inventory.addToInventory(new Apple("Tao tau", 50, 1, 10));
		Inventory.addToInventory(new Orange("Cam sanh", 20, 5, 0.02));
		Inventory.addToInventory(new Banana("Chuoi my", 50, 10, 0.01));
//
//		List<Fruit> a = new Inventory.getInstance();
//		for(Fruit i : a) {
//			System.out.println(i.getId() + " " + i.getName());
//		}
//
//		System.out.println(Cart.addToCart(6, 7));
//		Fruit fruit = new Fruit("Qua", 10, 6);
//		System.out.println(Inventory.getInstance());
//		Inventory.addToInventory(fruit);
//		Cart.addToCart(2, 1);
		
		Scanner sc = new Scanner(System.in);
		int x;
		while(true) {
			System.out.println("1. In ra thong tin kho");
			System.out.println("2. Them vao gio hang");
			x = sc.nextInt();	
			
			if(x == 1) {	
				for(int i=1; i <= Inventory.getSizeFruit(); i++) {
					System.out.println(Inventory.getFruit(i).getId());
					System.out.println(Inventory.getFruit(i).getName());
					System.out.println(Inventory.getFruit(i).getPrice());
					System.out.println(Inventory.getFruit(i).getQuantity());
					if(Inventory.getFruit(i) instanceof Apple) {
						Apple a = (Apple) Inventory.getFruit(i);
						System.out.println(a.getSugar());
					}
					else if(Inventory.getFruit(i) instanceof Orange) {
						Orange a = (Orange) Inventory.getFruit(i);
						System.out.println(a.getWeight());
					}
					else {
						Banana a = (Banana) Inventory.getFruit(i);
						System.out.println(a.getKali());
					}
				}
			}
			else {
				System.out.println("Nhap id, so luong");
				int id, soluong;
				id = sc.nextInt();
				soluong = sc.nextInt();
				Cart.addToCart(id, soluong);
			}
			
			System.out.println("0. Dung lai");
			System.out.println("1. Tiep tuc");
			x = sc.nextInt();
			if(x == 0) break;
		}
		
	}
	
}
