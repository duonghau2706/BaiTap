package View;

import java.util.Scanner;

import Controller.Utils.ScannerUtils;
import Controller.singleton.BangLichDay;
import Controller.singleton.BangLichHoc;
import Controller.singleton.BangLichTruc;
import Controller.singleton.DanhSachGiangVien;
import Controller.singleton.DanhSachNhanVien;
import Controller.singleton.DanhSachSinhVien;
import Model.entity.GiangVien;
import Model.entity.LichGiangDay;
import Model.entity.LichHoc;
import Model.entity.LichTrucNhanVien;
import Model.entity.NhanVien;
import Model.entity.SinhVien;
import Model.enumPack.ChucVu;
import Model.enumPack.GioiTinh;
import Model.enumPack.LoaiSinhVien;
import Model.enumPack.PhongHoc;
import Model.enumPack.TangNVVS;
import Model.enumPack.Time;

public class Input {
	
	static Scanner sc = new Scanner(System.in);

//	ShowMenu
//	"1. Them thong tin ca nhan vao danh sach"   -> NhapThongTin
//	"2. Them lich lam viec"					    -> NhapBangLichCanThem
//	"3. Nhap ID can in thong tin"				-> output.inthongtin
//	"4. Thoat"
	
	static public void NhapThongTin() {
		//Nhap thong tin
		System.out.println("Nhap ID: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap ten: ");
		String ten = ScannerUtils.readString(sc);
		System.out.println("Nhap tuoi: ");
		int tuoi = ScannerUtils.readInt(sc, 18, 100);
		System.out.println("Nhap gioi tinh:...(NU(0), NAM(1), KHAC(2))");
		int gt = ScannerUtils.readInt(sc, 0, 2);
		GioiTinh gioiTinh = GioiTinh.getGioiTinh(gt); 
		System.out.println("Nhap chuc vu: ... (BAOVE(1), VESINH(2), GIANGVIEN(3), SINHVIEN(4))");
		int cv = ScannerUtils.readInt(sc, 1, 4);
		ChucVu chucVu = ChucVu.getChucVu(cv);
		
		//Them vao danh sach
		if(chucVu == ChucVu.GIANGVIEN) {
			//Them vao danh sach giang vien neu giang vien chua duoc them
			if(DanhSachGiangVien.isTrungGiangVien(id) == false) {
				DanhSachGiangVien.addDanhSachGiangVien(new GiangVien(id, tuoi, ten, gioiTinh, chucVu));
			}
		}
		else if(chucVu == ChucVu.SINHVIEN) {
			System.out.println("Nhap loai sinh vien: ...(CHINHQUY(1), LIENTHONG(2), TAICHUC(3))");
			int lsv = ScannerUtils.readInt(sc, 1, 3);
			LoaiSinhVien loaiSinhVien = LoaiSinhVien.getLoaiSinhVien(lsv);
			
			//Them vao danh sach sinh vien neu sv chua duoc them
			if(DanhSachSinhVien.isTrungSinhVien(id) == false) {
				DanhSachSinhVien.addDanhSachSinhVien(new SinhVien(id, tuoi, ten, gioiTinh, chucVu, loaiSinhVien));
			}
		}
		else {
			//Them vao danh sach nhan vien neu nhan vien chua duoc them
			if(DanhSachNhanVien.isTrungNhanVien(id) == false) {
				DanhSachNhanVien.addDanhSachNhanVien(new NhanVien(id, tuoi, ten, gioiTinh, chucVu));
			}
		}
	}
	
	static public void NhapBangLichCanThem() {
		System.out.println("1. Them vao bang lich day");
		System.out.println("2. Them vao bang lich hoc");
		System.out.println("3. Them vao bang lich truc");
		System.out.println("Chon: ");
		int x = ScannerUtils.readInt(sc, 1, 3);
		if(x == 1) Input.NhapCaDay();
		else if(x == 2) Input.NhapCaHoc();
		else Input.NhapCaTruc();
	}
	
	 public static void NhapCaDay() {
		//Them vao bang lich day 
		System.out.println("Nhap ID nguoi day: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap thoi gian can them vao lich day");
		System.out.println("_6H45_7H45 (1), _8H_9H (2), _9H15_10H15 (3), _10H30_11H30 (4)");
		int tg = ScannerUtils.readInt(sc, 1, 4);
		Time time = Time.getTime(tg);
		System.out.println("Nhap phong hoc can them vao lich day");
		System.out.println("A101(1), B205(2), C306(3), D407(4), E509(5)");
		int ph = ScannerUtils.readInt(sc, 1, 5);
		PhongHoc phongHoc = PhongHoc.getPhongHoc(ph);
		
		//Them vao bang lich day neu khong trung
		if(BangLichDay.isTrungLich(time, phongHoc) == false) {
			BangLichDay.addBangLichDay(new LichGiangDay(id, time, phongHoc));
		}
	}
	 
	 public static void NhapCaHoc() {
		//Them vao bang lich hoc 
		System.out.println("Nhap ID sinh vien: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap thoi gian can them vao lich hoc");
		System.out.println("_6H45_7H45 (1), _8H_9H (2), _9H15_10H15 (3), _10H30_11H30 (4)");
		int tg = ScannerUtils.readInt(sc, 1, 4);
		Time time = Time.getTime(tg);
		System.out.println("Nhap phong hoc can them vao lich hoc");
		System.out.println("A101(1), B205(2), C306(3), D407(4), E509(5)");
		int ph = ScannerUtils.readInt(sc, 1, 5);
		PhongHoc phongHoc = PhongHoc.getPhongHoc(ph);
		
		//Them vao bang lich hoc neu khong trung
		if(BangLichHoc.isTrungLich(time, phongHoc) == false) {
			BangLichHoc.addBangLichHoc(new LichHoc(id, time, phongHoc));
		}
	}
	 
	public static void NhapCaTruc(){
		//Them vao bang lich truc 
		System.out.println("Nhap ID nguoi truc: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap thoi gian can them vao lich truc");
		System.out.println("_6H45_7H45 (1), _8H_9H (2), _9H15_10H15 (3), _10H30_11H30 (4)");
		int tg = ScannerUtils.readInt(sc, 1, 4);
		Time time = Time.getTime(tg);
		System.out.println("Nhap tang can them vao lich truc");
		System.out.println("TANG1(1), TANG2(2), TANG3(3), TANG4(4)");
		int tang = ScannerUtils.readInt(sc, 1, 4);
		TangNVVS tangNVVS = TangNVVS.getTang(tang);
		
		//Them vao bang lich truc neu khong trung
		if(BangLichTruc.isTrungLich(time, tangNVVS) == false) {
			BangLichTruc.addBangLichTruc(new LichTrucNhanVien(id, time, tangNVVS));
		}
	}
}
