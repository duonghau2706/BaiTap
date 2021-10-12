package Buoi7_bai1.entity;

import Buoi7_bai1.enumPack.ChucVu;
import Buoi7_bai1.enumPack.GioiTinh;

public class NhanVien extends Info{
	private GioiTinh gioiTinh;
	private ChucVu chucVu;
	
	public NhanVien(int id, int tuoi, String ten, int gioiTinh, int chucVu) {
		super(id, tuoi, ten);
		this.gioiTinh = GioiTinh.getGioiTinh(gioiTinh);
		this.chucVu = ChucVu.getChucVu(chucVu);
	}
	
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	
	public ChucVu getChucVu() {
		return chucVu;
	}
	
}
