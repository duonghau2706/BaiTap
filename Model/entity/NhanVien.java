package Model.entity;

import Model.enumPack.ChucVu;
import Model.enumPack.GioiTinh;

public class NhanVien extends Info{
	private GioiTinh gioiTinh;
	private ChucVu chucVu;
	
	public NhanVien(int id, int tuoi, String ten, GioiTinh gioiTinh, ChucVu chucVu) {
		super(id, tuoi, ten);
		this.gioiTinh = gioiTinh;
		this.chucVu = chucVu;
	}
	
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	
	public ChucVu getChucVu() {
		return chucVu;
	}
	
}
