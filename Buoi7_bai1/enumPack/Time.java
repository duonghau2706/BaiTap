package Buoi7_bai1.enumPack;

public enum Time {
	_6H45_7H45 (1), _8H_9H (2), _9H15_10H15 (3), _10H30_11H30 (4); 
	
	public final int tiet;
	
	private Time(int tiet) {
		this.tiet = tiet;
	}
	
	public static Time getTime(int tiet) {
		for(Time i : values()) {
			if(i.tiet == tiet) {
				return i;
			}
		}
		return null;
	}
}
