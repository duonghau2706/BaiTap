package Buoi7_bai1.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_bai1.entity.LichHoc;
import Buoi7_bai1.enumPack.PhongHoc;
import Buoi7_bai1.enumPack.Time;

public class BangLichHoc {
	static private List<LichHoc> bangLichHoc = new ArrayList<LichHoc>();
	
	private BangLichHoc(){
	}
	
	public List<LichHoc> getInstance() {
		return bangLichHoc;
	}
	
	//Them vao bang lich hoc
	static public boolean addBangLichHoc(LichHoc LichHoc) {
		bangLichHoc.add(LichHoc);
		return true;
	}
	
	//Kiem tra trung lich hoc khong
	static public boolean isTrungLich(int tg, int phong) {
		for (LichHoc i : bangLichHoc) {
			if(i.getTime() == Time.getTime(tg) && i.getPhongHoc() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}
	
	//Lay bang lich hoc
	static public LichHoc getLichHoc(int id) {
		for(LichHoc i : bangLichHoc) {
			if(i.getId() == id) return i;
		}
		return null;
	}

}
