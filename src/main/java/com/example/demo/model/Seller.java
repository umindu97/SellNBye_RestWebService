package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller2")//table name
public class Seller {

	@Id
	private int id;
	private String fname;
	private String lname;
//	private String displayname;
//	private String bdate;
//	private String sex;
//	private String address;
//	private String country;
//	private String city;
//	private String postal;
//	private String email;
//	private String phnumber;
//	private String category;
//	private String password;
//	private String confpw;
	
	
	
	public Seller(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
//		this.displayname = displayname;
//		this.bdate = bdate;
//		this.sex = sex;
//		this.address = address;
//		this.country = country;
//		this.city = city;
//		this.postal = postal;
//		this.email = email;
//		this.phnumber = phnumber;
//		this.category = category;
//		this.password = password;
//		this.confpw = confpw;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
//	public String getDisplayname() {
//		return displayname;
//	}
//	public void setDisplayname(String displayname) {
//		this.displayname = displayname;
//	}
//	public String getBdate() {
//		return bdate;
//	}
//	public void setBdate(String bdate) {
//		this.bdate = bdate;
//	}
//	public String getSex() {
//		return sex;
//	}
//	public void setSex(String sex) {
//		this.sex = sex;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getPostal() {
//		return postal;
//	}
//	public void setPostal(String postal) {
//		this.postal = postal;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPhnumber() {
//		return phnumber;
//	}
//	public void setPhnumber(String phnumber) {
//		this.phnumber = phnumber;
//	}
//	public String getCategory() {
//		return category;
//	}
//	public void setCategory(String category) {
//		this.category = category;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getConfpw() {
//		return confpw;
//	}
//	public void setConfpw(String confpw) {
//		this.confpw = confpw;
//	}
	
	
	@Override
	public String toString() {
		return "Seller [id=" + id + ", fname=" + fname + ", lname=" + lname + ", displayname=" + "]";
	}
	
	
	
	
}
