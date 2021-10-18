package Model.entity;

import Model.enumPack.TangNVVS;
import Model.enumPack.Time;

public class LichTrucNhanVien{
	private int id;
	private Time tg;
	private TangNVVS tang;
	
	public LichTrucNhanVien(int id, Time tg, TangNVVS tang) {
		this.id = id;
		this.tg = tg;
		this.tang = tang;
	}
	
	public int getId() {
		return id;
	}
	
	public Time getTime() {
		return tg;
	}
	
	public TangNVVS getTang() {
		return tang;
	}
}
