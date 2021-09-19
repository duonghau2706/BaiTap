package Buoi4_bai1;

public class Tao extends Qua {
	private float luongDuong;
	public Tao(String Ten, float gia, int soLuong, float luongDuong){
		super(Ten, gia, soLuong);
		this.luongDuong = luongDuong;
	}
	public float getLuongDuong() {
		return luongDuong;
	}
	public void setLuongDuong(float luongDuong) {
		this.luongDuong = luongDuong;
	}
	public void setLuongDuong(int luongDuong) {
		this.luongDuong = luongDuong;
	}
}
