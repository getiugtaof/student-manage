package com.program.demo.entity;

public class Student {
<<<<<<< HEAD
	private String stuID;
	private String stuName;
	private String password;
	
=======
	private String stuID;//学号
	private String stuName;//姓名
	private String password;//密码
	
	public Student(String stuID, String stuName, String password) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.password = password;
	}
>>>>>>> 716e58f349dd8735c687fb316ebeb5cf0b97dba4
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
