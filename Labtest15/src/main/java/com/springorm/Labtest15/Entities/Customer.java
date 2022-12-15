package com.springorm.Labtest15.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {

	@Id
	private int cid;
	private String cname;
	private List<Product> plist;
	
	public Customer() {
		super();

	}
	public Customer(int cid, String cname, List<Product> plist) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.plist = plist;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", plist=" + plist + "]";
	}
}
