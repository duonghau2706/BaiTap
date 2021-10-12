package Buoi7_bai1.mainProgram;

import java.util.Scanner;

import Buoi7_bai1.entity.GiangVien;
import Buoi7_bai1.entity.LichGiangDay;
import Buoi7_bai1.entity.LichHoc;
import Buoi7_bai1.entity.LichTrucNhanVien;
import Buoi7_bai1.entity.NhanVien;
import Buoi7_bai1.entity.SinhVien;
import Buoi7_bai1.enumPack.ChucVu;
import Buoi7_bai1.singleton.BangLichDay;
import Buoi7_bai1.singleton.BangLichHoc;
import Buoi7_bai1.singleton.BangLichTruc;
import Buoi7_bai1.singleton.DanhSachGiangVien;
import Buoi7_bai1.singleton.DanhSachNhanVien;
import Buoi7_bai1.singleton.DanhSachSinhVien;

public class MainProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("1. Them vao danh sach, bang lich cua giang vien, sinh vien, nhan vien");
			System.out.println("2. Nhap ID can in thong tin");
			int chon;
			chon = sc.nextInt();
			
			if(chon == 1) {
				System.out.println("Nhap ID: ");
				int id; id = sc.nextInt();
				System.out.println("Nhap ten: ");
				sc.nextLine();
				String ten; ten = sc.nextLine();
				System.out.println("Nhap tuoi: ");
				int tuoi; tuoi = sc.nextInt();
				System.out.println("Nhap gioi tinh:...(NU(0), NAM(1), KHAC(2))");
				int gioiTinh; gioiTinh = sc.nextInt();
				System.out.println("Nhap chuc vu: ... (BAOVE(1), VESINH(2), GIANGVIEN(3), SINHVIEN(4))");
				int chucVu; chucVu = sc.nextInt();
				
				if(ChucVu.getChucVu(chucVu) == ChucVu.GIANGVIEN) {
					
					//Them vao danh sach giang vien neu giang vien chua duoc them
					if(DanhSachGiangVien.isTrungGiangVien(id) == false) {
						DanhSachGiangVien.addDanhSachGiangVien(new GiangVien(id, tuoi, ten, gioiTinh, chucVu));
					}
					
					//Them vao bang lich day 
					System.out.println("Nhap thoi gian can them vao lich day");
					System.out.println("_6H45_7H45 (1), _8H_9H (2), _9H15_10H15 (3), _10H30_11H30 (4)");
					int tg; tg = sc.nextInt();
					System.out.println("Nhap phong hoc can them vao lich day");
					System.out.println("A101(1), B205(2), C306(3), D407(4), E509(5)");
					int ph; ph = sc.nextInt();
					
					//Them vao bang lich day neu khong trung
					if(BangLichDay.isTrungLich(tg, chon) == false) {
						BangLichDay.addBangLichDay(new LichGiangDay(id, tg, ph));
					}
				}
				else if(ChucVu.getChucVu(chucVu) == ChucVu.SINHVIEN) {
					System.out.println("Nhap loai sinh vien: ...(CHINHQUY(1), LIENTHONG(2), TAICHUC(3))");
					int loaiSinhVien; loaiSinhVien = sc.nextInt();
					
					//Them vao danh sach sinh vien neu sv chua duoc them
					if(DanhSachSinhVien.isTrungSinhVien(id) == false) {
						DanhSachSinhVien.addDanhSachSinhVien(new SinhVien(id, tuoi, ten, gioiTinh, chucVu, loaiSinhVien));
					}
					
					//Them vao bang lich hoc 
					System.out.println("Nhap thoi gian can them vao lich hoc");
					System.out.println("_6H45_7H45 (1), _8H_9H (2), _9H15_10H15 (3), _10H30_11H30 (4)");
					int tg; tg = sc.nextInt();
					System.out.println("Nhap phong hoc can them vao lich hoc");
					System.out.println("A101(1), B205(2), C306(3), D407(4), E509(5)");
					int ph; ph = sc.nextInt();
					
					//Them vao bang lich hoc neu lich hoc chua trung
					if(BangLichHoc.isTrungLich(tg, chon) == false) {
						BangLichHoc.addBangLichHoc(new LichHoc(id, tg, ph));
					}
				}
				else{
					//Them vao danh sach nhan vien neu nhan vien chua duoc them
					if(DanhSachNhanVien.isTrungNhanVien(id) == false) {
						DanhSachNhanVien.addDanhSachNhanVien(new NhanVien(id, tuoi, ten, gioiTinh, chucVu));
					}
					
					//Them vao bang lich truc 
					System.out.println("Nhap thoi gian can them vao lich truc");
					System.out.println("_6H45_7H45 (1), _8H_9H (2), _9H15_10H15 (3), _10H30_11H30 (4)");
					int tg; tg = sc.nextInt();
					System.out.println("Nhap tang can them vao lich truc");
					System.out.println("TANG1(1), TANG2(2), TANG3(3), TANG4(4)");
					int tang; tang = sc.nextInt();
					
					//Them vao bang lich truc neu khong trung
					if(BangLichTruc.isTrungLich(tg, tang) == false) {
						BangLichTruc.addBangLichTruc(new LichTrucNhanVien(id, tg, tang));
					}
				}
			}
			else {
				System.out.println("Nhap ID");
				int id; 
				id = sc.nextInt();
				
				System.out.println("Thong tin nhan su va cong viec");
				if(DanhSachGiangVien.getGiangVien(id) != null) {
					System.out.println(DanhSachGiangVien.getGiangVien(id).getId());
					System.out.println(DanhSachGiangVien.getGiangVien(id).getTen());
					System.out.println(DanhSachGiangVien.getGiangVien(id).getTuoi());
					System.out.println(DanhSachGiangVien.getGiangVien(id).getGioiTinh());
					System.out.println(DanhSachGiangVien.getGiangVien(id).getChucVu());	
					
					if(BangLichDay.getLichDay(id) !=null) {
						System.out.println(BangLichDay.getLichDay(id).getPhongHoc());
						System.out.println(BangLichDay.getLichDay(id).getTime());
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
						System.out.println(BangLichTruc.getLichTruc(id).getTang());
						System.out.println(BangLichTruc.getLichTruc(id).getTime());
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
						System.out.println(BangLichHoc.getLichHoc(id).getPhongHoc());
						System.out.println(BangLichHoc.getLichHoc(id).getTime());
					}
					else {
						System.out.println("Chua co thong tin");
					}
				}
				else {
					System.out.println("ID khong ton tai");
				}
			}
			
			if(chon !=1 && chon !=2) break;
			
		}
	}
}


