package Buoi7_bai1.enumPack;

public enum TangNVVS {
	TANG1(1), TANG2(2), TANG3(3), TANG4(4);
	
	private final int x;
	
	private TangNVVS(int x) {
		this.x = x;
	}
	
	public static TangNVVS getTang(int x) {
		for(TangNVVS i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}

}
