package Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.LichTrucNhanVien;
import Model.enumPack.TangNVVS;
import Model.enumPack.Time;

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
	static public boolean isTrungLich(Time tg, TangNVVS tang) {
		for (LichTrucNhanVien i : bangLichTruc) {
			if(i.getTime() == tg && i.getTang() == tang) {
				return true;
			}
		}
		return false;
	}
	
	//Tim id trong bang lich truc roi them vao lich ca nhan
		static public LichTrucNhanVien addLichCaNhan(List<LichTrucNhanVien> lichCaNhan, int id) {
			for(LichTrucNhanVien i : bangLichTruc) {
				if(i.getId() == id) {
					lichCaNhan.add(i);
				}
			}
			return null;
		}
	
	//Kiem tra id co trong bang lich truc khong
	static public LichTrucNhanVien getLichTruc(int id) {
		for(LichTrucNhanVien i : bangLichTruc) {
			if(i.getId() == id) return i;
		}
		return null;
	}
}
