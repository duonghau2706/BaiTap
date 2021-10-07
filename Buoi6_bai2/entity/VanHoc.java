package Buoi6_bai2.entity;

public class VanHoc extends Sach{
	private int lanTaiBan;
	private String theLoai;
	
	public VanHoc(String tenTacGia, float gia, int soLuong, int lanTaiBan, String theLoai) {
		super(tenTacGia, gia, soLuong);
		this.lanTaiBan = lanTaiBan;
		this.theLoai = theLoai;
	}

	public int getLanTaiBan() {
		return lanTaiBan;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	
}
