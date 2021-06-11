package com.example.smk3.restfulapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id_user;
	private String nip;
	private String nama;
	private String uid;
	private String password;
	private String role_enum;

	private String jabatan;
	private String address;
	
	@Lob
	private String uri_sign;
	
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole_enum() {
		return role_enum;
	}
	public void setRole_enum(String role_enum) {
		this.role_enum = role_enum;
	}
	public String getUri_sign() {
		return uri_sign;
	}
	public void setUri_sign(String uri_sign) {
		this.uri_sign = uri_sign;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserEntity{" +
				"id_user=" + id_user +
				", nip='" + nip + '\'' +
				", nama='" + nama + '\'' +
				", uid='" + uid + '\'' +
				", password='" + password + '\'' +
				", role_enum='" + role_enum + '\'' +
				", uri_sign='" + uri_sign + '\'' +
				", jabatan='" + jabatan + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
