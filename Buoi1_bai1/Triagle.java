package pk;

import java.util.Scanner;

public class Triagle {
	float a, b, c;
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap do dai 3 canh: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
	}
	float p=(a+b+c)/2;
	public float area() {
		return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public float perimeter() {
		return a+b+c;
	}
}
