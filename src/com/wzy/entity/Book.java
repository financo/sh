package com.wzy.entity;

public class Book {
	private Integer id;
	private String name;
	private String path;
	private String description;
	
	public Book() {
		super();
	}

	public Book(String name, String path, String description) {
		super();
		this.name = name;
		this.path = path;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
