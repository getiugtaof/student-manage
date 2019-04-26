package com.program.demo.entity;

public class Student {
	private String stuID;//学号
	private String stuName;//姓名
	private String password;//密码
	
	public Student(String stuID, String stuName, String password) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.password = password;
	}
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
