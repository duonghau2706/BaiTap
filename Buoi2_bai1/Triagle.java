package pk_buoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class Triagle {
	double x1, y1, x2, y2, x3, y3;
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
		lsSegment.add(new Segment(x1, y1, x2, y2));
		lsSegment.add(new Segment(x2, y2, x3, y3));
		lsSegment.add(new Segment(x3, y3, x1, y1));
	}
	public double area() {
		double a=lsSegment.get(0).length();
		double b=lsSegment.get(1).length();
		double c=lsSegment.get(2).length();
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public double perimeter() {
		double a=lsSegment.get(0).length();
		double b=lsSegment.get(1).length();
		double c=lsSegment.get(2).length();
		return a+b+c;
	}
}
