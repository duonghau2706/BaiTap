package Buoi6_bai2.entity;

public class NgoaiVan extends Sach{
	private int maISBN;
	private String theLoai;
	
	public NgoaiVan(String tenTacGia, float gia, int soLuong, int maISBN, String theLoai) {
		super(tenTacGia, gia, soLuong);
		this.maISBN = maISBN;
	}

	public int getMaISBN() {
		return maISBN;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

}
