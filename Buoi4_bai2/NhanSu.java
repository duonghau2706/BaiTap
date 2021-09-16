package pk_bai2;

public class NhanSu {
	private String ten;
	private int tuoi;
	private String cccd;
	public NhanSu(String ten, int tuoi, String cccd) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.cccd = cccd;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
}
