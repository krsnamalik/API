package com.example.smk3.restfulapi.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "mst_audit")
public class Mst_AuditEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id_audit;
	private String no_ba;
	private int id_company;
	private int id_user;
	private Date tgl_audit;
	private int id_format;
	private String nilai;
	private String status;
	private String tingkat;
	private String ketua_komp;
	private String sekret_komp;
	
	@Lob
	private String anggota_komp;
	
	@Lob
	private String uri_sign;
	
	private String lampiran;

	public int getId_audit() {
		return id_audit;
	}

	public void setId_audit(int id_audit) {
		this.id_audit = id_audit;
	}

	public String getNo_ba() {
		return no_ba;
	}

	public void setNo_ba(String no_ba) {
		this.no_ba = no_ba;
	}

	public int getId_company() {
		return id_company;
	}

	public void setId_company(int id_company) {
		this.id_company = id_company;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public Date getTgl_audit() {
		return tgl_audit;
	}

	public void setTgl_audit(Date tgl_audit) {
		this.tgl_audit = tgl_audit;
	}

	public int getId_format() {
		return id_format;
	}

	public void setId_format(int id_format) {
		this.id_format = id_format;
	}

	public String getNilai() {
		return nilai;
	}

	public void setNilai(String nilai) {
		this.nilai = nilai;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTingkat() {
		return tingkat;
	}

	public void setTingkat(String tingkat) {
		this.tingkat = tingkat;
	}

	public String getKetua_komp() {
		return ketua_komp;
	}

	public void setKetua_komp(String ketua_komp) {
		this.ketua_komp = ketua_komp;
	}

	public String getSekret_komp() {
		return sekret_komp;
	}

	public void setSekret_komp(String sekret_komp) {
		this.sekret_komp = sekret_komp;
	}

	public String getAnggota_komp() {
		return anggota_komp;
	}

	public void setAnggota_komp(String anggota_komp) {
		this.anggota_komp = anggota_komp;
	}

	public String getUri_sign() {
		return uri_sign;
	}

	public void setUri_sign(String uri_sign) {
		this.uri_sign = uri_sign;
	}

	public String getLampiran() {
		return lampiran;
	}

	public void setLampiran(String lampiran) {
		this.lampiran = lampiran;
	}

	@Override
	public String toString() {
		return "Mst_AuditEntity {" + 
				"id_audit=" + id_audit + 
				", no_ba='" + no_ba + '\'' +
				", id_company='" + id_company + '\'' +
				", id_user='" + id_user + '\'' +
				", tgl_audit='" + tgl_audit + '\'' + 
				", id_format='" + id_format + '\'' +
				", nilai='" + nilai + '\'' +
				", status='" + status + '\'' +
				", tingkat='" + tingkat + '\'' +
				", ketua_komp='" + ketua_komp + '\'' +
				", sekret_komp='" + sekret_komp + '\'' +
				", anggota_komp='" + anggota_komp + '\'' +
				", uri_sign='" + uri_sign + '\'' +
				", lampiran='" + lampiran + '\'' +
				'}';
	}
	
	
}
