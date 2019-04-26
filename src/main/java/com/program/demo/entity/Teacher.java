package com.program.demo.entity;

public class Teacher {
	private String teacherID;
	private String courseName;
	private String teacherName;
	private String password;
	
	
	public Teacher(String teacherID, String courseName, String teacherName, String password) {
		super();
		this.teacherID = teacherID;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.password = password;
	}
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
