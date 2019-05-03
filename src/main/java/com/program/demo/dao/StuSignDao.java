package com.program.demo.dao;

import com.program.demo.entity.*;
public interface StuSignDao {
	
	Student StuLogin(Student stu);//登录
	
	int StuRegister(Student stu);//注册
	
}
