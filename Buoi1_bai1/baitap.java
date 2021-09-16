package pk;

import java.util.Scanner;

public class baitap{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area, Perimeter");
		System.out.println("2.Average");
		System.out.println("Nhap: '1' hoac '2'");
		int x;
		x=sc.nextInt();
		if(x==1) {
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
					Square square = new Square();
					square.nhap();
					System.out.println(square.area());
					
				}
				else if(z==2) {
					Parallelogram parallelogram = new Parallelogram();
					parallelogram.nhap();
					System.out.println(parallelogram.area());
				}
				else if(z==3) {
					Rectangular rectangular = new Rectangular();
					rectangular.nhap();
					System.out.println(rectangular.area());
				}
				else if(z==4) {
					Triagle triagle = new Triagle();
					triagle.nhap();
					System.out.println(triagle.area());
				}
				else {
					Rhombus rhombus = new Rhombus();
					rhombus.nhap();
					System.out.println(rhombus.area());
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
					Square square = new Square();
					square.nhap();
					System.out.println(square.perimeter());
					
				}
				else if(z==2) {
					Parallelogram parallelogram = new Parallelogram();
					parallelogram.nhap();
					System.out.println(parallelogram.perimeter());
				}
				else if(z==3) {
					Rectangular rectangular = new Rectangular();
					rectangular.nhap();
					System.out.println(rectangular.perimeter());
				}
				else if(z==4) {
					Triagle triagle = new Triagle();
					triagle.nhap();
					System.out.println(triagle.perimeter());
				}
				else {
					Rhombus rhombus = new Rhombus();
					rhombus.nhap();
					System.out.println(rhombus.perimeter());
				}
			}
		}
		else if(x==2) {
				Average average = new Average();
				average.nhap();
				System.out.println(average.average());
		}
		else System.out.println("?");
	}
}