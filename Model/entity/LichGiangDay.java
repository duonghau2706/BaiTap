package Model.entity;

import java.util.ArrayList;
import java.util.List;

import Model.enumPack.PhongHoc;
import Model.enumPack.Time;

public class LichGiangDay{
	private int id;
	private Time tg;
	private PhongHoc phong;
	
	static List<LichGiangDay> lichGiangDay = new ArrayList<LichGiangDay>();
	
	public LichGiangDay(int id, Time tg, PhongHoc phong) {
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
