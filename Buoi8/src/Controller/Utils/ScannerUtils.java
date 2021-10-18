package Controller.Utils;

import java.util.Scanner;

public class ScannerUtils {

	public static int readInt(Scanner sc, int min, int max) {
		while (true) {
			try {
				int a = Integer.parseInt(sc.nextLine());
				if (a<min || a>max) {
					System.out.println("Ban phai nhap so >= " + min + " va <= " + max);
					System.out.println("Nhap lai: ");
				}
				else return a;
			} catch (NumberFormatException ex) {
				System.out.println("Loi NumberFormatException");
				System.out.println("Nhap lai so nguyen");
			}
		}
	}
	
	public static String readString(Scanner sc) {
		while (true) {
			try {
				while(true) {
					String s = sc.nextLine();
					int kt=1;
					for(int i=0; i<s.length(); i++) {
						if((s.charAt(i)-0>=97 && s.charAt(i)-0<=122) || (s.charAt(i)-0>=65 && s.charAt(i)-0<=90)) continue;
						else {
							System.out.println("Ten khong duoc chua ki tu dac biet");
							System.out.println("Nhap lai: ");
							kt=0;
							break;
						}
					}
					if(kt==1 && s!=null && !s.isEmpty()) return s;
				}
			} catch (Exception ex) {
				System.out.println("Nhap loi");
				System.out.println("Nhap lai: ");
			}
		}
	}

}
