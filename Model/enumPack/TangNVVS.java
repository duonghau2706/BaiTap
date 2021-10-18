package Model.enumPack;

public enum TangNVVS {
	TANG1(1), TANG2(2), TANG3(3), TANG4(4);
	
	private final int x;
	
	private TangNVVS(int x) {
		this.x = x;
	}
	
	public static TangNVVS getTang(int tang) {
		for(TangNVVS i : values()) {
			if(i.x == tang) return i;
		}
		return null;
	}

}
