package Buoi7_bai1.singleton;

import java.util.ArrayList;
import java.util.List;
import Buoi7_bai1.entity.GiangVien;

public class DanhSachGiangVien {
	static private List<GiangVien> danhSachGiangVien = new ArrayList<GiangVien>();
	
	private DanhSachGiangVien(){
	}
	
	public List<GiangVien> getInstance() {
		return danhSachGiangVien;
	}
	
	//Them vao danh sach giang vien
	static public boolean addDanhSachGiangVien(GiangVien giangVien) {
		danhSachGiangVien.add(giangVien);
		return true;
	}
	
	//Kiem tra trung giang vien khong
	static public boolean isTrungGiangVien(int id) {
		for (GiangVien i : danhSachGiangVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	//Lay thong tin giang vien
		static public GiangVien getGiangVien(int id) {
			for (GiangVien i : danhSachGiangVien) {
				if(i.getId() == id) {
					return i;
				}
			}
			return null;
		}
}
