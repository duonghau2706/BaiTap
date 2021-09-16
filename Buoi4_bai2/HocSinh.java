package pk_bai2;

public class HocSinh extends NhanSu{
	private String lop;
	public HocSinh(String ten, int tuoi, String cccd, String lop) {
		super(ten, tuoi, cccd);
		this.lop = lop;
	}
	public String getLop() {
		return this.lop;
	}
	
}