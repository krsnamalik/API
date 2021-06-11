package com.example.smk3.restfulapi.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "format")
public class FormatEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	private int id_format;
	private int no_format;
	private Date tanggal;
	private String uri_kriteria;
	private String uri_format;
	public int getId_format() {
		return id_format;
	}
	public void setId_format(int id_format) {
		this.id_format = id_format;
	}
	public int getNo_format() {
		return no_format;
	}
	public void setNo_format(int no_format) {
		this.no_format = no_format;
	}
	public Date getTanggal() {
		return tanggal;
	}
	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	public String getUri_kriteria() {
		return uri_kriteria;
	}
	public void setUri_kriteria(String uri_kriteria) {
		this.uri_kriteria = uri_kriteria;
	}
	public String getUri_format() {
		return uri_format;
	}
	public void setUri_format(String uri_format) {
		this.uri_format = uri_format;
	}
	@Override
	public String toString() {
		return "FormatEntity { " +
				"id_format=" + id_format + 
				", no_format='" + no_format + '\'' +
				", tanggal='" + tanggal + '\'' +
				", uri_kriteria='" + uri_kriteria + '\'' +
				", uri_format='" + uri_format + '\'' +
				'}';
	}
}
