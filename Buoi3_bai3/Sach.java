package pk_bai3;

public class Sach {
	private String tenSach;
	private TrangThai trangThai;
	private TacGia tacGia;
	private int soLuong;
	public Sach(String tenSach, TrangThai trangThai, TacGia tacGia, int soLuong) {
		this.tenSach = tenSach;
		this.trangThai = trangThai;
		this.tacGia = tacGia;
		this.soLuong = soLuong;
	}
	public String getTenSach() {
		return tenSach;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public TrangThai getTrangThai() {
		return trangThai;
	}
	public int getSoLuong() {
		return soLuong;
	}
	
}
