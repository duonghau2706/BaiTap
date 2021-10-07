package Buoi6_bai2.entity;

import Buoi6_bai2.singleton.Inventory;

abstract public class Sach {
	private String tenTacGia;
	private float gia;
	private int soLuong;
	private int id;
	static private int count;
	
	abstract public String getTheLoai();
	
	public Sach(String tenTacGia, float gia, int soLuong){
		this.tenTacGia = tenTacGia;
		this.gia = gia;
		this.soLuong = soLuong;
		this.id = count + 1;
		count++;
	}

	public int getId() {
		return id;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}
	
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public float getGia() {
		return gia;
	}
	
	public void setGia(float gia) {
		this.gia = gia;
	}
	//them sach vao kho thu vien
	public boolean addSoLuong(int id, int soLuong) {
		if(Inventory.isValid(id)) {
			this.soLuong += soLuong;
			return true;
		}
		return false;
	}
	
}
