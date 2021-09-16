package pk_buoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
	String ten, lop;
	double tuoi, toan, van, anh, n;
	Scanner sc = new Scanner(System.in);
	ArrayList<DS> lsClass = new ArrayList<DS>();
	public void process() {
		System.out.println("Nhap so luong sinh vien: ");
		n = sc.nextDouble();
		for(int i=0; i<n; i++) {
			sc.nextLine(); //tach tung dong trong string
			System.out.println("Nhap ten: ");
			ten = sc.nextLine();
			System.out.println("Nhap lop: ");
			lop = sc.nextLine();
			System.out.println("Nhap tuoi: ");
			tuoi = sc.nextDouble();
			System.out.println("Nhap diem toan: ");
			toan = sc.nextDouble();
			System.out.println("Nhap diem van: ");
			van = sc.nextDouble();
			System.out.println("Nhap diem anh: ");
			anh = sc.nextDouble();
			lsClass.add(new DS(ten, lop, tuoi, toan, van, anh));
		}
	}
	public void res() {
		for(int i=0; i<n; i++) {
			System.out.println("Ten sinh vien: " + lsClass.get(i).getTen());
			System.out.println("Lop: " + lsClass.get(i).getLop());
			System.out.println("Diem trung binh: " + lsClass.get(i).scoreAvg());
		}
	}
}
