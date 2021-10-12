package Buoi7_bai1.entity;

import Buoi7_bai1.enumPack.PhongHoc;
import Buoi7_bai1.enumPack.Time;

public class LichHoc extends LichLamViec{
	private int id;
	private Time tg;
	private PhongHoc phong;
	
	public LichHoc(int id, int tg, int phong) {
		this.id = id;
		this.tg = Time.getTime(tg);
		this.phong = PhongHoc.getPhongHoc(phong);
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
