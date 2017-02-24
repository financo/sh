package com.wzy.entity;

public class User {
	private Integer id;
	private String num;
	private String password;
	private String name;
	
	public User() {
		super();
	}
	
	
	public User(String num, String password, String name) {
		super();
		this.num = num;
		this.password = password;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
