package com.example.smk3.restfulapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "dtl_audit")
public class Dtl_AuditEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id_dtl;
	private int id_audit;
	private int no_kriteria;
	
	@Lob
	private String isi_audit;
	
	private String hasil;
	
	@Lob
	private String bukti;
	
	@Lob
	private String tindak;
	
	@Lob
	private String comment;

	public int getId_dtl() {
		return id_dtl;
	}

	public void setId_dtl(int id_dtl) {
		this.id_dtl = id_dtl;
	}

	public int getId_audit() {
		return id_audit;
	}

	public void setId_audit(int id_audit) {
		this.id_audit = id_audit;
	}

	public int getNo_kriteria() {
		return no_kriteria;
	}

	public void setNo_kriteria(int no_kriteria) {
		this.no_kriteria = no_kriteria;
	}

	public String getIsi_audit() {
		return isi_audit;
	}

	public void setIsi_audit(String isi_audit) {
		this.isi_audit = isi_audit;
	}

	public String getHasil() {
		return hasil;
	}

	public void setHasil(String hasil) {
		this.hasil = hasil;
	}

	public String getBukti() {
		return bukti;
	}

	public void setBukti(String bukti) {
		this.bukti = bukti;
	}

	public String getTindak() {
		return tindak;
	}

	public void setTindak(String tindak) {
		this.tindak = tindak;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Dtl_AuditEntity {" + 
				"id_dtl=" + id_dtl + 
				", id_audit='" + id_audit + '\'' +
				", no_kriteria='" + no_kriteria + '\'' +
				", isi_audit='" + isi_audit + '\'' +
				", hasil='" + hasil + '\'' +
				", bukti='" + bukti + '\'' +
				", tindak='" + tindak + '\'' +
				", comment='" + comment + '\'' +
				'}';
	}
	
	
}
