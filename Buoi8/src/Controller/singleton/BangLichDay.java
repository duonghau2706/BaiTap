package Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.LichGiangDay;
import Model.enumPack.PhongHoc;
import Model.enumPack.Time;

public class BangLichDay {
	
	static private List<LichGiangDay> bangLichDay = new ArrayList<LichGiangDay>();
	
	private BangLichDay(){
	}
	
	static public List<LichGiangDay> getInstance() {
		return bangLichDay;
	}
	
	//Them vao bang lich day
	static public boolean addBangLichDay(LichGiangDay lichGiangDay) {
		bangLichDay.add(lichGiangDay);
		return true;
	}
	
	//Kiem tra trung lich day khong
	static public boolean isTrungLich(Time tg, PhongHoc phong) {
		for (LichGiangDay i : bangLichDay) {
			if(i.getTime() == tg && i.getPhongHoc() == phong) {
				return true;
			}
		}
		return false;
	}
	
	//Tim id trong bang lich day roi them vao lich ca nhan
	static public LichGiangDay addLichCaNhan(List<LichGiangDay> lichCaNhan, int id) {
		for(LichGiangDay i : bangLichDay) {
			if(i.getId() == id) {
				lichCaNhan.add(i);
			}
		}
		return null;
	}
	
	//Kiem tra id co trong bang lich day khong
	static public LichGiangDay getLichDay(int id) {
		for(LichGiangDay i : bangLichDay) {
			if(i.getId() == id) return i;
		}
		return null;
	}
	
}
