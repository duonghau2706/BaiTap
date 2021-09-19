package pk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area");
		System.out.println("2.Perimeter");
		System.out.println("Nhap: '1' hoac '2'");
		int y;
		y = sc.nextInt();
		if(y==1) {
			System.out.println("1.Square");
			System.out.println("2.Parallelogram");
			System.out.println("3.Rectangular");
			System.out.println("4.Triagle");
			System.out.println("5.Rhombus");
			System.out.println("Nhap: '1', '2', '3', '4' hoac '5'");
			int z;
			z = sc.nextInt();
			if(z==1) {
				Square square = new Square(4);
				System.out.println(square.ChuVi());
			}
			else if(z==2) {
				Parallelogram parallelogram = new Parallelogram(4);
				System.out.println(parallelogram.ChuVi());
			}
			else if(z==3) {
				Rectangular rectangular = new Rectangular(4);
				System.out.println(rectangular.ChuVi());
			}
			else if(z==4) {
				TamGiac triagle = new TamGiac(3);
				System.out.println(triagle.ChuVi());
			}
			else {
				Rhombus rhombus = new Rhombus(4);
				System.out.println(rhombus.ChuVi());
			}
		}
		else {
			System.out.println("1.Square");
			System.out.println("2.Parallelogram");
			System.out.println("3.Rectangular");
			System.out.println("4.Triagle");
			System.out.println("5.Rhombus");
			System.out.println("Nhap: '1', '2', '3', '4' hoac '5'");
			int z;
			z = sc.nextInt();
			if(z==1) {
				Square square = new Square(4);
				System.out.println(square.DienTich());
			}
			else if(z==2) {
				Parallelogram parallelogram = new Parallelogram(4);
				System.out.println(parallelogram.DienTich());
			}
			else if(z==3) {
				Rectangular rectangular = new Rectangular(4);
				System.out.println(rectangular.DienTich());
			}
			else if(z==4) {
				TamGiac triagle = new TamGiac(3);
				System.out.println(triagle.DienTich());
			}
			else {
				Rhombus rhombus = new Rhombus(4);
				System.out.println(rhombus.DienTich());
			}
	
		}
	}
}