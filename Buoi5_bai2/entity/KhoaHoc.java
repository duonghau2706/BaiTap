package Buoi5_bai2.entity;

public class KhoaHoc extends Sach{
	private int namXB;

	public KhoaHoc(String tenTacGia, float gia, int soLuong, int namXB) {
		super(tenTacGia, gia, soLuong);
		this.namXB = namXB;
	}

	public int getNamXB() {
		return namXB;
	}
	
}
