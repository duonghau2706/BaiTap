package pk_bai2;

public class NhanVienBaoVe extends NhanSu {
	private String gioiTinh;
	public NhanVienBaoVe(String ten, int tuoi, String cccd, String gioiTinh) {
		super(ten, tuoi, cccd);
		this.gioiTinh = gioiTinh;
	}
	public String getGioiTinh() {
		return this.gioiTinh;
	}
	
}
