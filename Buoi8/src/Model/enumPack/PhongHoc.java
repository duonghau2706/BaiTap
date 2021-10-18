package Model.enumPack;

public enum PhongHoc {
	A101(1), B205(2), C306(3), D407(4), E509(5);
	
	public final int x;
	
	private PhongHoc(int x) {
		this.x = x;
	}
	
	public static PhongHoc getPhongHoc(int x) {
		for(PhongHoc i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}
}
