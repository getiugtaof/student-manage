package com.program.demo.dao;

import com.program.demo.entity.Teacher;

public interface TeacherSignDao {
	
	Teacher TeacherLogin(Teacher teacher);//登录
	
	int TeacherRegister(Teacher teacher);//注册
}
