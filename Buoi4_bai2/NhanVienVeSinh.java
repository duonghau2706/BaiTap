package pk_bai2;

public class NhanVienVeSinh extends NhanSu {
	private int luong;
	public NhanVienVeSinh(String ten, int tuoi, String cccd, int luong) {
		super(ten, tuoi, cccd);
		this.luong = luong;
	}
	public int getLuong() {
		return this.luong;
	}
}
