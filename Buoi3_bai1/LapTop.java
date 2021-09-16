package pk;

public class LapTop {
	CPU cpu;
	Ram ram;
	MainBroad mainBroad;
	Hang hang;
	int soLuong;
	public LapTop(CPU cpu, Ram ram, MainBroad mainBroad, Hang hang, int soLuong) {
		this.cpu = cpu;
		this.ram = ram;
		this.mainBroad = mainBroad;
		this.hang = hang;
		this.soLuong = soLuong;
	}
	public CPU getCpu() {
		return cpu;
	}
	public Ram getRam() {
		return ram;
	}
	public MainBroad getmainBroad() {
		return mainBroad;
	}
	public Hang getHang() {
		return hang;
	}
	public int getSoLuong() {
		return soLuong;
	}
}
