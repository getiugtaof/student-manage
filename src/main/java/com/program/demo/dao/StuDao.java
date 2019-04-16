package com.program.demo.dao;
import java.util.List;
import com.program.demo.entity.*;
public interface StuDao {
	
	List<Student> queryStu();//查
	
	int insertStu(Student stu);//增
	
	int updateStu(Student stu);//改
	
	int deleteStu(String stuID);//删
}
