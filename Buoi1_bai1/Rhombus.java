package pk;

import java.util.Scanner;

public class Rhombus {
	Scanner sc = new Scanner(System.in);
	float canh, cheo1, cheo2;
	public void nhap() {
		System.out.println("Nhap do dai 1 canh: ");
		canh = sc.nextInt();
		System.out.println("Nhap do dai duong cheo 1: ");
		cheo1 = sc.nextInt();
		System.out.println("Nhap do dai duong cheo 2: ");
		cheo2 = sc.nextInt();
	}
	public float area() {
		return cheo1*cheo2/2;
	}
	public float perimeter() {
		return 4*canh;
	}
}
