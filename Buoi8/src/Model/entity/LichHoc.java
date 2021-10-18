package Model.entity;

import Model.enumPack.PhongHoc;
import Model.enumPack.Time;

public class LichHoc{
	private int id;
	private Time tg;
	private PhongHoc phong;
	
	public LichHoc(int id, Time tg, PhongHoc phong) {
		this.id = id;
		this.tg = tg;
		this.phong = phong;
	}
	
	public int getId() {
		return id;
	}
	
	public Time getTime() {
		return tg;
	}
	
	public PhongHoc getPhongHoc() {
		return phong;
	}

}
