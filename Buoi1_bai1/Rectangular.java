package pk;

import java.util.Scanner;

public class Rectangular {
	float D, R;
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap do dai chieu dai: ");
		D = sc.nextInt();
		System.out.println("Nhap do dai chieu rong: ");
		R = sc.nextInt();
	}
	public float area() {
		return D*R;
	}
	public float perimeter() {
		return 2*(D+R);
	}
}
