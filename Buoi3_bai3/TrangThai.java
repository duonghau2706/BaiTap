package pk_bai3;

public class TrangThai {
	private TrongKho trongKho;
	private TrungBay trungBay;
	private ChoMuon choMuon;
	public TrangThai(TrongKho trongKho, TrungBay trungBay, ChoMuon choMuon) {
		this.trongKho = trongKho;
		this.trungBay = trungBay;
		this.choMuon = choMuon;
	}
	public TrongKho getTrongKho() {
		return trongKho;
	}
	public TrungBay getTrungBay() {
		return trungBay;
	}
	public ChoMuon getChoMuon() {
		return choMuon;
	}
}