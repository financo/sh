package com.wzy.entity;

public class Ppt {
	private Integer id;
	private String name;
	private String path;
	private String date;
	
	public Ppt() {
		super();
	}

	public Ppt(String name, String path, String date) {
		super();
		this.name = name;
		this.path = path;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
