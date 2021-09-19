package Buoi4_bai1;

public class Cam extends Qua{
	private float canNang;
	public Cam(String Ten, float gia, int soLuong, float canNang){
		super(Ten, gia, soLuong);
		this.canNang = canNang;
	}
	public float getCanNang() {
		return canNang;
	}
	public void setCanNang(float canNang) {
		this.canNang = canNang;
	}
	public void setCanNang(int canNang) {
		this.canNang = canNang;
	}
}
