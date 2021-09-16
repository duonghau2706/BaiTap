package pk;

import java.util.Scanner;

public class Average {
	Scanner sc = new Scanner(System.in);
	String s;
	float age, toan, van, anh;
	public void nhap() {
		System.out.println("Nhap ten: ");
		s = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = sc.nextFloat();
		System.out.println("Nhap diem 3 mon: 'Toan', 'Van', 'Anh'");
		toan = sc.nextFloat();
		van = sc.nextFloat();
		anh = sc.nextFloat();
	}
	public float average() {
		return (toan+van+anh)/3;
	}
}
