package Buoi5_bai2.entity;

public class NgoaiVan extends Sach{
	private int maISBN;
	
	public NgoaiVan(String tenTacGia, float gia, int soLuong, int maISBN) {
		super(tenTacGia, gia, soLuong);
		this.maISBN = maISBN;
	}

	public int getMaISBN() {
		return maISBN;
	}

}
