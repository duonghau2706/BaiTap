package pk_buoi2;

public class DS {
	private String ten, lop;
	private double tuoi, toan, van, anh;
	public DS(String ten, String lop, double tuoi, double toan, double van, double anh) {
		this.ten = ten;
		this.lop = lop;
		this.tuoi = tuoi;
		this.toan = toan;
		this.van = van;
		this.anh = anh;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTen() {
		return this.ten;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getLop() {
		return this.lop;
	}
	public void setTuoi(double tuoi) {
		this.tuoi = tuoi;
	}
	public double getTuoi() {
		return this.tuoi;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getToan() {
		return this.toan;
	}
	public void setVan(double van) {
		this.van = van;
	}
	public double getVan() {
		return this.van;
	}
	public void setAnh(double anh) {
		this.anh = anh;
	}
	public double getAnh() {
		return this.anh;
	}
	public double scoreAvg() {
		return (toan+van+anh)/3;
	}
}
