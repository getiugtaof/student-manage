package com.program.demo.entity;

public class HomeAccess {
  private String stuID;
  public String getStuID() {
	return stuID;
}
public void setStuID(String stuID) {
	this.stuID = stuID;
}
public int getWorkId() {
	return workId;
}
public void setWorkId(int workId) {
	this.workId = workId;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public String getTeacherComments() {
	return teacherComments;
}
public void setTeacherComments(String teacherComments) {
	this.teacherComments = teacherComments;
}
private int workId;
  private int score;
  private  String  teacherComments;
  

}
