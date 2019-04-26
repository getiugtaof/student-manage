package com.program.demo.service;



import org.springframework.web.bind.annotation.RequestBody;

import com.program.demo.entity.Assess;
import com.program.demo.entity.Student;
public interface StuService {
	Student Login(Student stu);//登录

	int Register(Student stu);//注册

	Assess Upload(String stuID,String workID,Double size);//上传作业
	
}
