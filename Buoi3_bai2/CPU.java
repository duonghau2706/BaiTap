package pk_bai2;

public class CPU {
	private String name;
	private Hang hang;
	private int matchID;
	public CPU(String name, Hang hang, int matchID) {
		this.name = name;
		this.hang = hang;
		this.matchID = matchID;
	}
	public String getName() {
		return name;
	}
	public Hang getHang() {
		return hang;
	}
	public int getMatchID() {
		return matchID;
	}
}
