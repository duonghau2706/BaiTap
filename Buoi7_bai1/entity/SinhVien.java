package Buoi7_bai1.entity;

import Buoi7_bai1.enumPack.ChucVu;
import Buoi7_bai1.enumPack.GioiTinh;
import Buoi7_bai1.enumPack.LoaiSinhVien;

public class SinhVien extends Info{
	private GioiTinh gioiTinh;
	private ChucVu chucVu;
	private LoaiSinhVien loaiSinhVien;
	
	public SinhVien(int id, int tuoi, String ten, int gioiTinh, int chucVu, int loaiSinhVien) {
		super(id, tuoi, ten);
		this.gioiTinh = GioiTinh.getGioiTinh(gioiTinh);
		this.chucVu = ChucVu.getChucVu(chucVu);
		this.loaiSinhVien = LoaiSinhVien.getLoaiSinhVien(loaiSinhVien);
	}
	
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	
	public ChucVu getChucVu() {
		return chucVu;
	}
	
	public LoaiSinhVien getLoaiSinhVien() {
		return loaiSinhVien;
	}
}
