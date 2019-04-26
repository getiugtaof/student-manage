package com.program.demo.dao;

import com.program.demo.entity.HomeWork;

public interface TeacherReleaseDao {
	int Release(HomeWork work);//发布作业
	
	String getCourseName(String teacherID);//获取教师对应的课程名
	
	int getWorkID();//获取作业数
}
