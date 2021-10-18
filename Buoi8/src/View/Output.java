package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Utils.ScannerUtils;
import Controller.singleton.BangLichDay;
import Controller.singleton.BangLichHoc;
import Controller.singleton.BangLichTruc;
import Controller.singleton.DanhSachGiangVien;
import Controller.singleton.DanhSachNhanVien;
import Controller.singleton.DanhSachSinhVien;
import Model.entity.LichGiangDay;
import Model.entity.LichHoc;
import Model.entity.LichTrucNhanVien;

public class Output {

	static Scanner sc = new Scanner(System.in);
	
	static List<LichGiangDay> lichGiangVienCaNhan = new ArrayList<LichGiangDay>();
	static List<LichHoc> lichSinhVienCaNhan = new ArrayList<LichHoc>();
	static List<LichTrucNhanVien> lichNhanVienCaNhan = new ArrayList<LichTrucNhanVien>();
	
	public static void InThongTin() {
		System.out.println("Nhap ID: ");
		int id; 
		id = ScannerUtils.readInt(sc, 1, 100);
		
		System.out.println("Thong tin nhan su va cong viec");
		if(DanhSachGiangVien.getGiangVien(id) != null) {
			System.out.println(DanhSachGiangVien.getGiangVien(id).getId());
			System.out.println(DanhSachGiangVien.getGiangVien(id).getTen());
			System.out.println(DanhSachGiangVien.getGiangVien(id).getTuoi());
			System.out.println(DanhSachGiangVien.getGiangVien(id).getGioiTinh());
			System.out.println(DanhSachGiangVien.getGiangVien(id).getChucVu());	
			
			if(BangLichDay.getLichDay(id) !=null) {
				//Them vao lich giang day ca nhan theo id
				BangLichDay.addLichCaNhan(lichGiangVienCaNhan, id);
				
				//In lich day theo id
				for(int i = 0; i<lichGiangVienCaNhan.size(); i++) {
					System.out.println(lichGiangVienCaNhan.get(i).getPhongHoc());
					System.out.println(lichGiangVienCaNhan.get(i).getTime());
				}
			}
			else {
				System.out.println("Chua co thong tin");
			}
		}
		else if(DanhSachNhanVien.getNhanVien(id) != null) {
			System.out.println(DanhSachNhanVien.getNhanVien(id).getId());
			System.out.println(DanhSachNhanVien.getNhanVien(id).getTen());
			System.out.println(DanhSachNhanVien.getNhanVien(id).getTuoi());
			System.out.println(DanhSachNhanVien.getNhanVien(id).getGioiTinh());
			System.out.println(DanhSachNhanVien.getNhanVien(id).getChucVu());
			
			if(BangLichTruc.getLichTruc(id) !=null) {
				//Them vao lich truc ca nhan theo id
				BangLichTruc.addLichCaNhan(lichNhanVienCaNhan, id);
				
				//In lich truc theo id
				for(int i = 0; i<lichNhanVienCaNhan.size(); i++) {
					System.out.println(lichNhanVienCaNhan.get(i).getTang());
					System.out.println(lichNhanVienCaNhan.get(i).getTime());
				}
			}
			else {
				System.out.println("Chua co thong tin");
			}
		}
		else if(DanhSachSinhVien.getSinhVien(id) != null){
			System.out.println(DanhSachSinhVien.getSinhVien(id).getId());
			System.out.println(DanhSachSinhVien.getSinhVien(id).getTen());
			System.out.println(DanhSachSinhVien.getSinhVien(id).getTuoi());
			System.out.println(DanhSachSinhVien.getSinhVien(id).getGioiTinh());
			System.out.println(DanhSachSinhVien.getSinhVien(id).getChucVu());
	
			if(BangLichHoc.getLichHoc(id) !=null) {
				//Them vao lich hoc ca nhan theo id
				BangLichHoc.addLichCaNhan(lichSinhVienCaNhan, id);
				
				//In lich hoc theo id
				for(int i = 0; i<lichSinhVienCaNhan.size(); i++) {
					System.out.println(lichSinhVienCaNhan.get(i).getPhongHoc());
					System.out.println(lichSinhVienCaNhan.get(i).getTime());
				}
			}
			else {
				System.out.println("Chua co thong tin");
			}
		}
		else {
			System.out.println("ID khong ton tai");
		}
	}
}
