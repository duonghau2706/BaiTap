package Buoi7_bai1.enumPack;

public enum ChucVu {
	BAOVE(1), VESINH(2), GIANGVIEN(3), SINHVIEN(4);

	public final int x;
	
	private ChucVu(int x) {
		this.x = x;
	}
		
	public static ChucVu getChucVu(int x) {
		for(ChucVu i : values()) {
			if(i.x == x) {
				return i;
			}
		}
		return null;
	}
	
}
