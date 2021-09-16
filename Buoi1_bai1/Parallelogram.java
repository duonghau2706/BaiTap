package pk;

import java.util.Scanner;

public class Parallelogram {
	float Day, Cc, Cb;
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap do dai canh day: ");
		Day = sc.nextInt();
		System.out.println("Nhap do dai chieu cao: ");
		Cc = sc.nextInt();
		System.out.println("Nhap do dai canh ben: ");
		Cb = sc.nextInt();
	}
	public float area() {
		return Day*Cc;
	}
	public float perimeter() {
		return 2*(Day+Cb);
	}
}
