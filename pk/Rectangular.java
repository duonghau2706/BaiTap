package pk;

import java.util.Scanner;

public class Rectangular extends TuGiac{
	public Rectangular(int n) {
		super(n);
	}
	public float ChuVi() {
		return (super.a[1]+super.a[2])*2;
	}
	public float DienTich() {
		return super.a[1]*super.a[2];
	}
}
