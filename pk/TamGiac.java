package pk;

import java.util.Scanner;

public class TamGiac extends DaGiac{
	Scanner sc = new Scanner(System.in);
	private float[]  a = new float[5];
	private int tmp;
	public TamGiac(int n) {
		super(n);
		tmp=n;
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			System.out.println("Nhap do dai canh thu" + i + ": ");
			a[i] = sc.nextFloat();
		}
	}
	public float ChuVi() {
		float cv = 0;
		for(int i=1; i<=tmp; i++) {
			cv+= a[i];
		}
		return cv;
	}
	public float DienTich() {
		float cv = 0;
		for(int i=1; i<=tmp; i++) {
			cv+= a[i];
		}
		float p = cv/2;
		return (float) Math.sqrt(p*(p-a[1])*(p-a[2])*(p-a[3]));
	}
}
