package pk_bai2;

public class GiaoVienMon extends GiaoVien{
	private String mon;
	public GiaoVienMon(String ten, int tuoi, String cccd, int to, String mon) {
		super(ten, tuoi, cccd, to);
		this.mon = mon;
	}
	public String getMon() {
		return this.mon;
	}
}
