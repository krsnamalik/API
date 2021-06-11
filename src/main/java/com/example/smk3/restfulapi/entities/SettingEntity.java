package com.example.smk3.restfulapi.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "setting")

public class SettingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	private int id_setting;
	private int id_format;
	private Date tanggal;
	
	@Lob
	private String uri_sign;

	public int getId_setting() {
		return id_setting;
	}

	public void setId_setting(int id_setting) {
		this.id_setting = id_setting;
	}

	public int getId_format() {
		return id_format;
	}

	public void setId_format(int id_format) {
		this.id_format = id_format;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}

	public String getUri_sign() {
		return uri_sign;
	}

	public void setUri_sign(String uri_sign) {
		this.uri_sign = uri_sign;
	}

	@Override
	public String toString() {
		return "SettingEntity {" +
				"id_setting=" + id_setting +
				", id_format='" + id_format + '\'' + 
				", tanggal='" + tanggal + '\'' +
				", uri_sign='" + uri_sign + '\'' +
				'}';
	}
	
	
}
