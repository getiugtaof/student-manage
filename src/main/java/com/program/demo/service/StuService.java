package com.program.demo.service;

<<<<<<< HEAD
import java.util.List;


import com.program.demo.entity.Student;
public interface StuService {
	List<Student> queryStuList();//查

	int insertStu(Student stu);

	int modifyStu(Student stu);

	int deleteStu(String stuID);
=======


import org.springframework.web.bind.annotation.RequestBody;

import com.program.demo.entity.Assess;
import com.program.demo.entity.Student;
public interface StuService {
	Student Login(Student stu);//登录

	int Register(Student stu);//注册

	Assess Upload(String stuID,String workID,Double size);//上传作业
	
>>>>>>> 716e58f349dd8735c687fb316ebeb5cf0b97dba4
}
