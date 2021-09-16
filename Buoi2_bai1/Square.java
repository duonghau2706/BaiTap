package pk_buoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class Square {
	double x1, y1, x2, y2, x3, y3, x4, y4;
	Scanner sc = new Scanner(System.in);
	ArrayList<Segment> lsSegment = new ArrayList<Segment>();	
	public void nhap() {
		System.out.println("Nhap toa do dinh thu nhat");
		System.out.println("x1= ");
		x1 = sc.nextDouble();
		System.out.println("y1= ");
		y1 = sc.nextDouble();
		System.out.println("Nhap toa do dinh thu hai");
		System.out.println("x2= ");
		x2 = sc.nextDouble();
		System.out.println("y2= ");
		y2 = sc.nextDouble();
		System.out.println("Nhap toa do dinh thu ba");
		System.out.println("x3= ");
		x3 = sc.nextDouble();
		System.out.println("y3= ");
		y3 = sc.nextDouble();
		System.out.println("Nhap toa do dinh thu tu");
		System.out.println("x4= ");
		x4 = sc.nextDouble();
		System.out.println("y4= ");
		y4 = sc.nextDouble();
		lsSegment.add(new Segment(x1, y1, x2, y2));
		lsSegment.add(new Segment(x2, y2, x3, y3));
		lsSegment.add(new Segment(x3, y3, x4, y4));
		lsSegment.add(new Segment(x4, y4, x1, y1));
	}
	public double area() {
		double a = lsSegment.get(0).length();
		return a*a;
	}
	public double perimeter() {
		double a = lsSegment.get(0).length();
		return 4*a;
	}
}