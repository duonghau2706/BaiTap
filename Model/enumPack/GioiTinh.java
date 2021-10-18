package Model.enumPack;

public enum GioiTinh {
	NAM(1), NU(0), KHAC(2);

	public final int x;
	private GioiTinh(int x) {
		this.x = x;
	}
	
	public static GioiTinh getGioiTinh(int gt) {
		for(GioiTinh i : values()) {
			if(i.x == gt) return i;
		}
		return null;
	}
}
