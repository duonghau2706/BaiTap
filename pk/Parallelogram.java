package pk;

import java.util.Scanner;

public class Parallelogram extends TuGiac{
	protected float h;
	public Parallelogram(int n) {
		super(n);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai chieu cao: ");
		h = sc.nextFloat();
	}
	public float ChuVi() {
		return (super.a[1]+super.a[2])*2;
	}
	public float DienTich() {
		if(super.a[1]>h) return super.a[2]*h;
		return super.a[1]*h;
	}
}
