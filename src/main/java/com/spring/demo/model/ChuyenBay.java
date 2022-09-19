package com.spring.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "baitap2_hangkhong")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenBay {
	@Id
	private String maCB;
	private String gaDi;
	private String gaDen;
	private int doDai;
	private Date gioDi;
	private Date gioDen;
	private double chiPhi;
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
	public double getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(double chiPhi) {
		this.chiPhi = chiPhi;
	}
	
	

}
