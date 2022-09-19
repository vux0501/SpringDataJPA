package com.spring.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "baitap2_hangkhong")
@Entity
public class ChuyenBay {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String maCB;
	private String gaDi;
	private String gaDen;
	private int doDai;
	private Date gioDi;
	private Date gioDen;
	private int chiPhi;
	public String getMaCB() {
		return maCB;
	}
	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public int getDoDai() {
		return doDai;
	}
	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}
	public Date getGioDi() {
		return gioDi;
	}
	public void setGioDi(Date gioDi) {
		this.gioDi = gioDi;
	}
	public Date getGioDen() {
		return gioDen;
	}
	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}
	public int getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}
	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, Date gioDi, Date gioDen, int chiPhi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}
	public ChuyenBay() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}

	
	
	
	
	
	
}
