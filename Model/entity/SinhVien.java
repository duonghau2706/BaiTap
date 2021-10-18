package Model.entity;

import Model.enumPack.ChucVu;
import Model.enumPack.GioiTinh;
import Model.enumPack.LoaiSinhVien;

public class SinhVien extends Info{
	private GioiTinh gioiTinh;
	private ChucVu chucVu;
	private LoaiSinhVien loaiSinhVien;
	
	public SinhVien(int id, int tuoi, String ten, GioiTinh gioiTinh, ChucVu chucVu, LoaiSinhVien loaiSinhVien) {
		super(id, tuoi, ten);
		this.gioiTinh = gioiTinh;
		this.chucVu = chucVu;
		this.loaiSinhVien = loaiSinhVien;
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
