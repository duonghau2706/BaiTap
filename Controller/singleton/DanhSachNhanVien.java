package Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Model.entity.NhanVien;

public class DanhSachNhanVien {
	static private List<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();
	
	private DanhSachNhanVien(){
	}
	
	public List<NhanVien> getInstance() {
		return danhSachNhanVien;
	}
	
	//Them vao danh sach nhan vien
	static public boolean addDanhSachNhanVien(NhanVien nhanVien) {
		danhSachNhanVien.add(nhanVien);
		return true;
	}
	
	//Kiem tra trung nhan vien khong
	static public boolean isTrungNhanVien(int id) {
		for (NhanVien i : danhSachNhanVien) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	//Lay thong tin nhan vien
	static public NhanVien getNhanVien(int id) {
		for (NhanVien i : danhSachNhanVien) {
			if(i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
