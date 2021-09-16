package pk_bai3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		s =  sc.nextLine();
		
		ArrayList<ChoMuon> lsChoMuon = new ArrayList<ChoMuon>();
		lsChoMuon.add(new ChoMuon(50)); lsChoMuon.add(new ChoMuon(70)); lsChoMuon.add(new ChoMuon(90));  
		lsChoMuon.add(new ChoMuon(20)); lsChoMuon.add(new ChoMuon(40)); lsChoMuon.add(new ChoMuon(60)); 
		lsChoMuon.add(new ChoMuon(11)); lsChoMuon.add(new ChoMuon(33)); lsChoMuon.add(new ChoMuon(88)); 
		
		ArrayList<TrungBay> lsTrungBay = new ArrayList<TrungBay>();
		lsTrungBay.add(new TrungBay(20)); lsTrungBay.add(new TrungBay(40)); lsTrungBay.add(new TrungBay(60));
		lsTrungBay.add(new TrungBay(11)); lsTrungBay.add(new TrungBay(33)); lsTrungBay.add(new TrungBay(88));
		lsTrungBay.add(new TrungBay(50)); lsTrungBay.add(new TrungBay(70)); lsTrungBay.add(new TrungBay(90));

		ArrayList<TrongKho> lsTrongKho = new ArrayList<TrongKho>();
		lsTrongKho.add(new TrongKho(11)); lsTrongKho.add(new TrongKho(33)); lsTrongKho.add(new TrongKho(88)); 
		lsTrongKho.add(new TrongKho(50)); lsTrongKho.add(new TrongKho(70)); lsTrongKho.add(new TrongKho(90)); 
		lsTrongKho.add(new TrongKho(20)); lsTrongKho.add(new TrongKho(40)); lsTrongKho.add(new TrongKho(60)); 

		ArrayList<TrangThai> lsTrangThai = new ArrayList<TrangThai>();
		lsTrangThai.add(new TrangThai(lsTrongKho.get(0), lsTrungBay.get(0), lsChoMuon.get(0)));
		lsTrangThai.add(new TrangThai(lsTrongKho.get(1), lsTrungBay.get(1), lsChoMuon.get(1)));
		lsTrangThai.add(new TrangThai(lsTrongKho.get(2), lsTrungBay.get(2), lsChoMuon.get(2)));
		
		ArrayList<TacGia> lsTacGia = new ArrayList<TacGia>();
		lsTacGia.add(new TacGia("Jonh")); lsTacGia.add(new TacGia("Peter")); lsTacGia.add(new TacGia("Nai"));
		lsTacGia.add(new TacGia("Nai")); lsTacGia.add(new TacGia("Yue")); lsTacGia.add(new TacGia("Gia"));
		lsTacGia.add(new TacGia("Peter")); lsTacGia.add(new TacGia("Maja")); lsTacGia.add(new TacGia("Yue"));

		ArrayList<Sach> lsSach = new ArrayList<Sach>();
		lsSach.add(new Sach("Toan cao cap", lsTrangThai.get(0), lsTacGia.get(0), 555));
		lsSach.add(new Sach("Kinh te hoc", lsTrangThai.get(1), lsTacGia.get(1), 444));
		lsSach.add(new Sach("Triet hoc", lsTrangThai.get(2), lsTacGia.get(2), 333));

		for(int i=0; i<3; i++) {
			if(s.equals(lsSach.get(i).getTenSach())) {
				System.out.println("Ten sach: " + lsSach.get(i).getTenSach());
				System.out.println("Ten tac gia: " + lsSach.get(i).getTacGia().getTenTG());
				System.out.println("Tong so sach:" + lsSach.get(i).getSoLuong());
				System.out.println("So sach trong kho: " + lsSach.get(i).getTrangThai().getTrongKho().getSoLuong());
				System.out.println("So sach trung bay: " + lsSach.get(i).getTrangThai().getTrungBay().getSoLuong());
				System.out.println("So sach cho muon: " + lsSach.get(i).getTrangThai().getChoMuon().getSoLuong());
				break;
			}
		}
	}
}
