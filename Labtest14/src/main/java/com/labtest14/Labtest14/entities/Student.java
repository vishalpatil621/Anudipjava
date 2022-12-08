package com.labtest14.Labtest14.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private String contact;

	public Student() {
		super();
		
	}
	public Student(int sid, String sname, String contact) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.contact = contact;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", contact=" + contact + "]";
	}
	
}
