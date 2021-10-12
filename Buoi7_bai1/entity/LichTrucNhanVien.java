package Buoi7_bai1.entity;

import Buoi7_bai1.enumPack.TangNVVS;
import Buoi7_bai1.enumPack.Time;

public class LichTrucNhanVien extends LichLamViec{
	private int id;
	private Time tg;
	private TangNVVS tang;
	
	public LichTrucNhanVien(int id, int tg, int tang) {
		this.id = id;
		this.tg = Time.getTime(tg);
		this.tang = TangNVVS.getTang(tang);
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
