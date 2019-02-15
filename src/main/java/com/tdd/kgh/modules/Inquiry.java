package com.tdd.kgh.modules;

public class Inquiry {
	int id;
	int CId;
	String date;
	boolean paid;
	int amount;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int CId) {
		this.CId = CId;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public boolean getPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
