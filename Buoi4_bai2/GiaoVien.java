package pk_bai2;

public class GiaoVien extends NhanSu{
	private int to;
	public GiaoVien(String ten, int tuoi, String cccd, int to) {
		super(ten, tuoi, cccd);
		this.to = to;
	}

	public int getTo() {
		return to;
	}
	
}
