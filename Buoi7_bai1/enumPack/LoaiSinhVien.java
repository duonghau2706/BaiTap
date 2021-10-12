package Buoi7_bai1.enumPack;

public enum LoaiSinhVien {
	CHINHQUY(1), LIENTHONG(2), TAICHUC(3);
	
	public final int x;
	
	private LoaiSinhVien(int x) {
		this.x = x;
	}
		
	public static LoaiSinhVien getLoaiSinhVien(int x) {
		for(LoaiSinhVien i : values()) {
			if(i.x == x) {
				return i;
			}
		}
		return null;
	}
	
}
