package Buoi4_bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int x;
		
		ArrayList<Qua> lsQua = new ArrayList<Qua>(); 
		lsQua.add(new Tao("Tao1", 15, 50, 3));
		lsQua.add(new Tao("Tao2", 10, 100, 2));
		lsQua.add(new Cam("Cam1", 25, 40, 2.5f));
		lsQua.add(new Cam("Cam2", 40, 30, 3.5f));
		lsQua.add(new Chuoi("Chuoi1", 100, 30, 39.1f));
		lsQua.add(new Chuoi("Chuoi2", 80, 60, 39.2f));
		
		System.out.println("1. In thong tin cac loai hoa qua");
		System.out.println("2. Nhap so tien hien co");
		x = sc.nextInt();
		if(x==1) {
			for(int i=0; i<lsQua.size(); i++) {
				System.out.println("Ten qua: " + lsQua.get(i).getTen());
				System.out.println("Gia: " + lsQua.get(i).getGia());
				System.out.println("So luong: " + lsQua.get(i).getSoLuong());
				if(lsQua.get(i) instanceof Tao) {
					Tao tmp = (Tao) lsQua.get(i);
					System.out.println("Luong duong:" + tmp.getLuongDuong());
				}
				else if(lsQua.get(i) instanceof Cam) {
					Cam tmp = (Cam) lsQua.get(i);
					System.out.println("Can nang: " + tmp.getCanNang());
				}
				else {
					Chuoi tmp = (Chuoi) lsQua.get(i);
					System.out.println("Khoi luong dong vi: " + tmp.getKLDV());
				}
			}
		}
		else {
			float money;
			money = sc.nextFloat();
			for(int i=0; i<lsQua.size(); i++) {
				System.out.print("Mua duoc toi da: ");
				int tmp = (int)Math.min(money/(lsQua.get(i).getGia()), lsQua.get(i).getSoLuong());
				System.out.println(tmp + " " + lsQua.get(i).getTen());
			}
		}

	}

}
