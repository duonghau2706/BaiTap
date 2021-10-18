package View;

import java.util.Scanner;

import Controller.Utils.ScannerUtils;

public class ShowMenu {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void ThongBao() {
		System.out.println("1. Them thong tin ca nhan vao danh sach");
		System.out.println("2. Them lich lam viec");
		System.out.println("3. Nhap ID can in thong tin");
		System.out.println("Chon: ");
		
		int x = ScannerUtils.readInt(sc, 1, 3);
		if(x == 1) Input.NhapThongTin();
		else if(x == 2) Input.NhapBangLichCanThem();
		else Output.InThongTin();
	}
}
