package com.program.demo.service;

import java.util.List;


import com.program.demo.entity.Student;
public interface StuService {
	List<Student> queryStuList();//查

	int insertStu(Student stu);

	int modifyStu(Student stu);

	int deleteStu(String stuID);
}
