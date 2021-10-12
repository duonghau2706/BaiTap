package Buoi7_bai1.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_bai1.entity.LichTrucNhanVien;
import Buoi7_bai1.enumPack.TangNVVS;
import Buoi7_bai1.enumPack.Time;

public class BangLichTruc {
	
	static private List<LichTrucNhanVien> bangLichTruc = new ArrayList<LichTrucNhanVien>();
	
	private BangLichTruc(){
	}
	
	public List<LichTrucNhanVien> getInstance() {
		return bangLichTruc;
	}
	
	//Them vao bang lich truc nhan vien
	static public boolean addBangLichTruc(LichTrucNhanVien lichTrucNhanVien) {
		bangLichTruc.add(lichTrucNhanVien);
		return true;
	}
	
	//Kiem tra trung lich truc khong
	static public boolean isTrungLich(int tg, int tang) {
		for (LichTrucNhanVien i : bangLichTruc) {
			if(i.getTime() == Time.getTime(tg) && i.getTang() == TangNVVS.getTang(tang)) {
				return true;
			}
		}
		return false;
	}
	
	//Lay lich truc
	static public LichTrucNhanVien getLichTruc(int id) {
		for(LichTrucNhanVien i : bangLichTruc) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
