package com.sportshoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int uid;
	
	String name;
	
	String pwd;
	
	Long phno;
	
	String address;
	
	public Users() {
	}
	
	
	
	public Users(int uid, String name, String pwd, Long phno, String address) {
		super();
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.phno = phno;
		this.address = address;
	}
	
	

	public Users(String name, String pwd, Long phno, String address) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.phno = phno;
		this.address = address;
	}



	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", name=" + name + ", pwd=" + pwd + ", phno=" + phno + ", address=" + address + "]";
	}
	
	

}
