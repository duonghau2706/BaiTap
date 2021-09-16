package pk;

import java.util.Scanner;

public class Square extends TuGiac{
	public Square(int n) {
		super(n);
	}
	public float ChuVi() {
		return super.a[1]*4;
	}
	public float DienTich() {
		return super.a[1]*super.a[1];
	}
}
