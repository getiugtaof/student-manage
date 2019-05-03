package com.program.demo.entity;

import java.sql.Date;

public class Assess {
	private String stuID;
	private String workID;
	private Date datetime;
	private double size;
	private String stuScore;
	private int teacherScore;
	private String comment;
	
	public Assess(String stuID, String workID, Date datetime, double size, String stuScore, int teacherScore,
			String comment) {
		super();
		this.stuID = stuID;
		this.workID = workID;
		this.datetime = datetime;
		this.size = size;
		this.stuScore = stuScore;
		this.teacherScore = teacherScore;
		this.comment = comment;
	}
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getWorkID() {
		return workID;
	}
	public void setWorkID(String workID) {
		this.workID = workID;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getStuScore() {
		return stuScore;
	}
	public void setStuScore(String stuScore) {
		this.stuScore = stuScore;
	}
	public int getTeacherScore() {
		return teacherScore;
	}
	public void setTeacherScore(int teacherScore) {
		this.teacherScore = teacherScore;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
