package com.program.demo.entity;

import java.sql.Date;

public class HomeWork {
	private Integer workID;
	private String courseName;
	private String workName;
	private Date deadline;
	
	
	
	
	public HomeWork(Integer workID, String courseName, String workName, Date deadline) {
		super();
		this.workID = workID;
		this.courseName = courseName;
		this.workName = workName;
		this.deadline = deadline;
	}
	public Integer getWorkID() {
		return workID;
	}
	public void setWorkID(Integer workID) {
		this.workID = workID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
}
