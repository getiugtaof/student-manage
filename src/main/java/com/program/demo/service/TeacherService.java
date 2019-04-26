package com.program.demo.service;

import java.sql.Date;

import com.program.demo.entity.HomeWork;
import com.program.demo.entity.Teacher;

public interface TeacherService {
	Teacher Login(Teacher teacher);//登录

	int Register(Teacher teacher);//注册
	
	HomeWork Release(String teacherID,String workName,Date deadline);//发布作业
}
