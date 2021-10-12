package Buoi7_bai1.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_bai1.entity.SinhVien;

public class DanhSachSinhVien {
	static private List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
	
	private DanhSachSinhVien(){
	}
	
	public List<SinhVien> getInstance() {
		return danhSachSinhVien;
	}
	
	//Them vao danh sach sinh vien
	static public boolean addDanhSachSinhVien(SinhVien sinhVien) {
		danhSachSinhVien.add(sinhVien);
		return true;
	}
	
	//Kiem tra trung sinh vien khong
	static public boolean isTrungSinhVien(int id) {
		for (SinhVien i : danhSachSinhVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	//Lay thong tin sinh vien
		static public SinhVien getSinhVien(int id) {
			for (SinhVien i : danhSachSinhVien) {
				if(i.getId() == id) {
					return i;
				}
			}
			return null;
		}
}
