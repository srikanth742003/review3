package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDetail")
public class textiles {
@Id
@Column(name="sareeid")
private int sareeid;
@Column(name="employeename")
private String employeename;
@Column(name="color")
private String sareecolor;
@Column(name="size")
private String sareesize;
@Column(name="price")
private int sareeprice;
public int getSareeid() {
	return sareeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getSareecolor() {
	return sareecolor;
}
public void setSareecolor(String sareecolor) {
	this.sareecolor = sareecolor;
}
public String getSareesize() {
	return sareesize;
}
public void setSareesize(String sareesize) {
	this.sareesize = sareesize;
}
public int getSareeprice() {
	return sareeprice;
}
public void setSareeprice(int sareeprice) {
	this.sareeprice = sareeprice;
}
public void setSareeid(int sareeid) {
	this.sareeid = sareeid;
}

}