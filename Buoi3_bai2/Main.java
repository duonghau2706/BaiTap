package pk_bai2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s, hangLap, ramLap, hangRamm, cpuLap, hangCpuu, mbLap, hangMbb;
		int keyy = 0;
		
		ArrayList<Hang> lsHang = new ArrayList<Hang>();
		lsHang.add(new Hang("Lenovo Thinkpad E570"));
		lsHang.add(new Hang("Dell Vos"));
		lsHang.add(new Hang("Acer White"));
		lsHang.add(new Hang("Asus Woolf"));
		
		ArrayList<Ram> lsRam = new ArrayList<Ram>();
		lsRam.add(new Ram("Ryzen 3500", lsHang.get(2), 1));
		lsRam.add(new Ram("Ryzen 6300", lsHang.get(3), 2));
		lsRam.add(new Ram("Intel 10500", lsHang.get(0), 99));
		
		ArrayList<CPU> lsCpu = new ArrayList<CPU>();
		lsCpu.add(new CPU("o cung Lenovo", lsHang.get(0), 99));
		lsCpu.add(new CPU("o cung 2", lsHang.get(3), 1));
		lsCpu.add(new CPU("o cung 3", lsHang.get(1), 2));
		
		ArrayList<MainBroad> lsMainBroad = new ArrayList<MainBroad>();
		lsMainBroad.add(new MainBroad("main Lenovo", lsHang.get(0), 99));
		lsMainBroad.add(new MainBroad("main 31", lsHang.get(2), 2));
		lsMainBroad.add(new MainBroad("main 14", lsHang.get(3), 1));
		lsMainBroad.add(new MainBroad("main 52", lsHang.get(1), 3));
		
		ArrayList<LapTop> lsLapTop = new ArrayList<LapTop>();
		lsLapTop.add(new LapTop(lsCpu.get(1), lsRam.get(2), lsMainBroad.get(3), lsHang.get(0), 100));
		lsLapTop.add(new LapTop(lsCpu.get(2), lsRam.get(0), lsMainBroad.get(2), lsHang.get(2), 50));
		lsLapTop.add(new LapTop(lsCpu.get(0), lsRam.get(2), lsMainBroad.get(0), lsHang.get(0), 9999));
		
		int kt=0;
		System.out.println("Nhap ten hang laptop: ");
		//sc.nextLine();
		s = sc.nextLine();
		for(int i=0; i<lsHang.size(); i++) {
			if(s.equals(lsHang.get(i).getName())) {
				kt=1;
				break;
			}
		}
		if(kt==0) System.out.println("Khong co hang nay!"); 
		else {
			hangLap = s;
			int kt1=0, kt2=0, kt3=0;
			String hangRam;
			int matchIdRam;
			System.out.println("Nhap ten RAM, hang RAM, matchID RAM: ");
			//sc.nextLine();
			String ss = sc.nextLine();
			hangRam = sc.nextLine();
			matchIdRam = sc.nextInt();
			for(int i=0; i<lsRam.size(); i++) {
			//	System.out.println(ss);
				if(ss.equals(lsRam.get(i).getName())) {
					kt1=1;
					break;
				}
			}
			for(int i=0; i<lsRam.size(); i++) {
				if(hangRam.equals(lsRam.get(i).getHang().getName())) {
					kt2=1;
					break;
				}
			}
			for(int i=0; i<lsRam.size(); i++) {
				if(matchIdRam == lsRam.get(i).getMatchID()) {
					keyy = lsRam.get(i).getMatchID();
					kt3=1;
					break;
				}
			}
			if(kt1==1 && kt2==1 && kt3==1) {
				hangRamm = hangRam; 
//				System.out.println(hangRamm);
				ramLap = ss;
				kt1=0; kt2=0; kt3=0;
				String hangCpu;
				int matchIdCpu;
				System.out.println("Nhap ten CPU, hang CPU, matchID CPU: ");
				sc.nextLine();
				s = sc.nextLine();
				hangCpu = sc.nextLine();
				
				matchIdCpu = sc.nextInt();
				for(int i=0; i<lsCpu.size(); i++) {
					//System.out.println(s);
					//System.out.println(lsCpu.get(i).getName());
					if(s.equals(lsCpu.get(i).getName())) {
						kt1=1;
						break;
					}
				}
				for(int i=0; i<lsCpu.size(); i++) {
					if(hangCpu.equals(lsCpu.get(i).getHang().getName())) {
						kt2=1;
						break;
					}
				}
				for(int i=0; i<lsCpu.size(); i++) {
					//System.out.println(keyy);
					//System.out.println(lsCpu.get(i).getMatchID());
					if(matchIdCpu == lsCpu.get(i).getMatchID() && keyy == matchIdCpu ) {
						kt3=1;
						break;
					}
				}
				if(kt1==1 && kt2==1 && kt3==1) {
					cpuLap = s;
					hangCpuu = hangCpu;
//					System.out.println(hangCpuu);
//					System.out.println(hangCpu);
					kt1=0; kt2=0; kt3=0;
					String hangMb;
					int matchIdMb;
					System.out.println("Nhap ten MainBroad, hang MainBroad, matchID MainBroad: ");
					sc.nextLine();
					String sss = sc.nextLine();
					
					hangMb = sc.nextLine();
					matchIdMb = sc.nextInt();
					for(int i=0; i<lsMainBroad.size(); i++) {
//						System.out.println(sss);
//						System.out.println(lsMainBroad.get(i).getName());
						if(sss.equals(lsMainBroad.get(i).getName())) {
							kt1=1;
							break;
						}
					}
					for(int i=0; i<lsMainBroad.size(); i++) {
						if(hangMb.equals(lsMainBroad.get(i).getHang().getName())) {
							kt2=1;
							break;
						}
					}
					for(int i=0; i<lsMainBroad.size(); i++) {
						if(matchIdMb == lsMainBroad.get(i).getMatchID() && keyy == lsMainBroad.get(i).getMatchID()) {
							kt3=1;
							break;
						}
					}
					if(kt1==1 && kt2==1 && kt3==1) {
						kt=0;
						hangMbb = hangMb;
//						System.out.println(hangMbb);
//						System.out.println(hangMb);
						mbLap = sss;
						for(int i=0; i<lsLapTop.size(); i++) {
//							System.out.println(lsLapTop.get(i).getRam().getName());
//							System.out.println(ramLap);
							if (hangLap.equals(lsLapTop.get(i).getHang().getName())
									&& ramLap.equals(lsLapTop.get(i).getRam().getName())
									&& hangRamm.equals(lsLapTop.get(i).getRam().getHang().getName())
									&& cpuLap.equals(lsLapTop.get(i).getCpu().getName())
									&& hangCpuu.equals(lsLapTop.get(i).getCpu().getHang().getName())
									&& mbLap.equals(lsLapTop.get(i).getmainBroad().getName())
									&& hangMbb.equals(lsLapTop.get(i).getmainBroad().getHang().getName())
									) 
							{
								System.out.println(hangLap + " " + ramLap + " " + hangRamm 
										+ " " + cpuLap + " " + hangCpuu + " " + mbLap + " " + hangMbb + " " 
										+ lsLapTop.get(i).getSoLuong());
								kt=1;
							}
						}
						if(kt==0) System.out.println("Khong co LapTop loai nay!");
					}
					else System.out.println("Khong co MainBroad nay! ");	
				}
				else System.out.println("Khong co CPU nay! ");
			}
			else System.out.println("Khong co RAM nay! ");
		}
	}
}
