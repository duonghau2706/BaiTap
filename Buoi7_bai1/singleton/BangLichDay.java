package Buoi7_bai1.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_bai1.entity.LichGiangDay;
import Buoi7_bai1.enumPack.PhongHoc;
import Buoi7_bai1.enumPack.Time;

public class BangLichDay {
	
	static private List<LichGiangDay> bangLichDay = new ArrayList<LichGiangDay>();
	
	private BangLichDay(){
	}
	
	public List<LichGiangDay> getInstance() {
		return bangLichDay;
	}
	
	//Them vao bang lich day
	static public boolean addBangLichDay(LichGiangDay lichGiangDay) {
		bangLichDay.add(lichGiangDay);
		return true;
	}
	
	//Kiem tra trung lich day khong
	static public boolean isTrungLich(int tg, int phong) {
		for (LichGiangDay i : bangLichDay) {
			if(i.getTime() == Time.getTime(tg) && i.getPhongHoc() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}
	
	//Lay bang lich day
	static public LichGiangDay getLichDay(int id) {
		for(LichGiangDay i : bangLichDay) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
