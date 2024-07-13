package com.web.model;

public class Ebill {
	private String id;
	private String name;
	private int cr;
	private int pr;
	public Ebill() {
		super();
	}
	public Ebill(String id, String name, int cr, int pr) {
		super();
		this.id = id;
		this.name = name;
		this.cr = cr;
		this.pr = pr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCr() {
		return cr;
	}
	public void setCr(int cr) {
		this.cr = cr;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
	@Override
	public String toString() {
		return "Ebill [id=" + id + ", name=" + name + ", cr=" + cr + ", pr=" + pr + "]";
	}
	
	
	
	}
	
	

	
