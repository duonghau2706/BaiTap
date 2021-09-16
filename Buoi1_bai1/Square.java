package pk;

import java.util.Scanner;

public class Square {
	float canh;
	Scanner sc = new Scanner(System.in);
	public void nhap(){
		System.out.println("Nhap do dai 1 canh: ");
		canh = sc.nextInt();
	}
	public float area() {
		return canh*canh;
	}
	public float perimeter() {
		return 4*canh;
	}
}
