package Buoi5_bai2.entity;

public class VanHoc extends Sach{
	private int lanTaiBan;
	
	public VanHoc(String tenTacGia, float gia, int soLuong, int lanTaiBan) {
		super(tenTacGia, gia, soLuong);
		this.lanTaiBan = lanTaiBan;
	}

	public int getLanTaiBan() {
		return lanTaiBan;
	}
	
}
