package Buoi6_bai2.entity;

public class KhoaHoc extends Sach{
	private int namXB;
	private String theLoai;

	public KhoaHoc(String tenTacGia, float gia, int soLuong, int namXB, String theLoai) {
		super(tenTacGia, gia, soLuong);
		this.namXB = namXB;
		this.theLoai = theLoai;
	}

	public int getNamXB() {
		return namXB;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	
}
