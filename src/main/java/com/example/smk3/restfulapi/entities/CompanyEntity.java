package com.example.smk3.restfulapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id_company;
	private String nama;
	private String jns_usaha;
	private String alamat;
	private String telpon;
	
	public int getId_company() {
		return id_company;
	}
	public void setId_company(int id_company) {
		this.id_company = id_company;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getJns_usaha() {
		return jns_usaha;
	}
	public void setJns_usaha(String jns_usaha) {
		this.jns_usaha = jns_usaha;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getTelpon() {
		return telpon;
	}
	public void setTelpon(String telpon) {
		this.telpon = telpon;
	}
	@Override
	public String toString() {
		return "CompanyEntity {" + 
				"id_company=" + id_company +
				", nama='" + nama + '\'' +
				", jns_usaha='" + jns_usaha + '\'' +
				", alamat='" + alamat + '\'' +
				", telpon='" + telpon + '\'' +
				'}';
	}
}
