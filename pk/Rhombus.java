package pk;

import java.util.Scanner;

public class Rhombus extends TuGiac{
	protected float cheo;
	public Rhombus(int n) {
		super(n);
		System.out.println("Nhap do dai duong cheo");
		cheo = sc.nextFloat();
	}
	public float ChuVi() {
		return 4*super.a[1];
	}
	public float DienTich() {
		float p = 2*super.a[1];
		return (float) (2*Math.sqrt(p*(p-a[1])*(p-a[2])*(p-cheo)));
	}
}
