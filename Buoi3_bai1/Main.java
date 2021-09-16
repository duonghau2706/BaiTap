package pk;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Hang> lsHang = new ArrayList<Hang>();
		lsHang.add(new Hang("Lenovo Thinkpad E570"));
		lsHang.add(new Hang("Dell Vos"));
		lsHang.add(new Hang("Acer White"));
		lsHang.add(new Hang("Asus Woolf"));
		
		ArrayList<Ram> lsRam = new ArrayList<Ram>();
		lsRam.add(new Ram("Ryzen 3500", lsHang.get(2)));
		lsRam.add(new Ram("Ryzen 6300", lsHang.get(3)));
		lsRam.add(new Ram("Intel 10500", lsHang.get(0)));
		
		ArrayList<CPU> lsCpu = new ArrayList<CPU>();
		lsCpu.add(new CPU("o cung 1", lsHang.get(0)));
		lsCpu.add(new CPU("o cung 2", lsHang.get(3)));
		lsCpu.add(new CPU("o cung 3", lsHang.get(1)));
		
		ArrayList<MainBroad> lsMainBroad = new ArrayList<MainBroad>();
		lsMainBroad.add(new MainBroad("main 81", lsHang.get(0)));
		lsMainBroad.add(new MainBroad("main 31", lsHang.get(2)));
		lsMainBroad.add(new MainBroad("main 14", lsHang.get(3)));
		lsMainBroad.add(new MainBroad("main 52", lsHang.get(1)));
		
		
		ArrayList<LapTop> lsLapTop = new ArrayList<LapTop>();
		lsLapTop.add(new LapTop(lsCpu.get(1), lsRam.get(2), lsMainBroad.get(3), lsHang.get(0), 100));
		lsLapTop.add(new LapTop(lsCpu.get(2), lsRam.get(0), lsMainBroad.get(2), lsHang.get(2), 50));
		lsLapTop.add(new LapTop(lsCpu.get(2), lsRam.get(1), lsMainBroad.get(1), lsHang.get(1), 65));
		
		
		System.out.println(lsLapTop.get(0).getHang().getName());
		System.out.println(lsLapTop.get(0).getRam().getName());
		System.out.println(lsLapTop.get(0).getCpu().getName());
		System.out.println(lsLapTop.get(0).getmainBroad().getName());
		System.out.println(lsLapTop.get(0).getSoLuong());
	
	}

}
