package Controller.mainProgram;

import java.util.Scanner;

import Controller.Utils.ScannerUtils;
import View.ShowMenu;

public class MainProgram {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. Dang nhap");
			System.out.println("2. Thoat");
			System.out.println("Chon: ");
			
			int x = ScannerUtils.readInt(sc, 1, 2);
			if(x == 1) ShowMenu.ThongBao();
			else break;
		}
	}
}
