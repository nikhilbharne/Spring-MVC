package com.nt.bo;

import java.sql.Date;

public class MedicineDetailsBO {
	private int mid;	private String medName;
	private int price;
	private Date mfgDate;
	private Date expDate;
	
	public int getMid() {
		return mid;
	}	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

}
