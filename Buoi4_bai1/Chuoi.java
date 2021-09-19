package Buoi4_bai1;

public class Chuoi extends Qua{
	private float KLDV;
	public Chuoi(String Ten, float gia, int soLuong, float KLDV){
		super(Ten, gia, soLuong);
		this.KLDV = KLDV;
	}
	public float getKLDV() {
		return KLDV;
	}
	public void setKLDV(float KLDV) {
		this.KLDV = KLDV;
	}
	public void setKLDV(int KLDV) {
		this.KLDV = KLDV;
	}
}
