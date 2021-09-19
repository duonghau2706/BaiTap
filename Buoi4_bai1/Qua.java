package Buoi4_bai1;

public class Qua {
	protected String ten;
	private float gia;
	private int soLuong;
	public Qua(String ten, float gia, int soLuong) {
		this.ten = ten;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float ten) {
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
}
