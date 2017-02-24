package com.wzy.entity;

public class Firstpage {
	private Integer id;
	private String description;
	
	
	public Firstpage() {
		super();
	}
	
	public Firstpage(String description) {
		super();
		this.description = description;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
