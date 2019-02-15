package com.tdd.kgh.modules;

public class Inventory {

	int id;
	String name;
	int qty;
	boolean available;
	int cp;
	int sp;
	int CId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean getAvailability() {
		return this.available;
	}

	public void setAvailability(boolean availability) {
		this.available = availability;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}
	
	public int getCId() {
		return CId;
	}

	public void setCId(int CId) {
		this.CId = CId;
	}
}
