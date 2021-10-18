package Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.LichHoc;
import Model.enumPack.PhongHoc;
import Model.enumPack.Time;

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
	static public boolean isTrungLich(Time tg, PhongHoc phong) {
		for (LichHoc i : bangLichHoc) {
			if(i.getTime() == tg && i.getPhongHoc() == phong) {
				return true;
			}
		}
		return false;
	}
	
	//Tim id trong bang lich hoc roi them vao lich ca nhan
	static public LichHoc addLichCaNhan(List<LichHoc> lichCaNhan, int id) {
		for(LichHoc i : bangLichHoc) {
			if(i.getId() == id) {
				lichCaNhan.add(i);
			}
		}
		return null;
	}
		
	//Kiem tra id co trong bang lich hoc khong
	static public LichHoc getLichHoc(int id) {
		for(LichHoc i : bangLichHoc) {
			if(i.getId() == id) return i;
		}
		return null;
	}

}
