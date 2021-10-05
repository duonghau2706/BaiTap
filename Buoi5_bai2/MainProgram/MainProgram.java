package Buoi5_bai2.MainProgram;

import java.util.Scanner;

import Buoi5_bai2.entity.KhoaHoc;
import Buoi5_bai2.entity.NgoaiVan;
import Buoi5_bai2.entity.VanHoc;
import Buoi5_bai2.singleton.Cart;
import Buoi5_bai2.singleton.Inventory;


public class MainProgram {

	public static void main(String[] args) {
		
		Inventory.addToInventory(new VanHoc("Vanhoc1", 55, 2, 2));
		Inventory.addToInventory(new KhoaHoc("Khoahoc", 100, 10, 2002));
		Inventory.addToInventory(new NgoaiVan("Ngoaivan1", 200, 50, 128372));
		Inventory.addToInventory(new NgoaiVan("Ngoaivan2", 500, 100, 992398));
		
		Scanner sc = new Scanner(System.in);
		int x;		
		while(true) {
			System.out.println("1. In ra thong tin kho");
			System.out.println("2. Them vao gio hang");
			x = sc.nextInt();
			if(x == 1) {
				for(int i=1; i <= Inventory.getSizeSach(); i++) {
					System.out.println(Inventory.getSach(i).getId());
					System.out.println(Inventory.getSach(i).getTenTacGia());
					System.out.println(Inventory.getSach(i).getGia());
					System.out.println(Inventory.getSach(i).getSoLuong());
					if(Inventory.getSach(i) instanceof VanHoc) {
						VanHoc a = (VanHoc) Inventory.getSach(i);
						System.out.println(a.getLanTaiBan());
					}
					else if(Inventory.getSach(i) instanceof KhoaHoc) {
						KhoaHoc a = (KhoaHoc) Inventory.getSach(i);
						System.out.println(a.getNamXB());
					}
					else {
						NgoaiVan a = (NgoaiVan) Inventory.getSach(i);
						System.out.println(a.getMaISBN());
					}
				}
			}
			else {
				System.out.println("Nhap id, so luong");
				int id, soLuong;
				id = sc.nextInt();
				soLuong = sc.nextInt();
				Cart.addToCart(id, soLuong);
			}
			
			System.out.println("0. Dung lai");
			System.out.println("1. Tiep tuc");
			x = sc.nextInt();
			if(x == 0) break;
		}
	
	}

}
