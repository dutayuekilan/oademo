package com.itcast.yuanyuan.oademo.pojo;

import java.io.Serializable;

public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", password="
				+ password + ", age=" + age + "]";
	}
	private int id;
	private String user_name;
	private String password;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
