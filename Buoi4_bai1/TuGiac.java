package pk;

import java.util.Scanner;

public class TuGiac extends DaGiac{
	Scanner sc = new Scanner(System.in);
	protected float[]  a = new float[5];
	private int tmp;
	public TuGiac(int n) {
		super(n);
		tmp=n;
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			System.out.println("Nhap do dai canh thu" + i + ": ");
			a[i] = sc.nextFloat();
		}
	}
}