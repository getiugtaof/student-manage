package com.program.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.demo.dao.StuDao;
import com.program.demo.entity.Student;
import com.program.demo.service.StuService;

@Service
public class StuServiceImpl implements StuService{
	@Autowired
	private StuDao stuDao;
	
	
	@Override
	public List<Student> queryStuList() {
		// TODO Auto-generated method stub
		return stuDao.queryStu();
	}


	@Override
	public int insertStu(Student stu) {
		// TODO Auto-generated method stub
		return stuDao.insertStu(stu);
	}


	@Override
	public int modifyStu(Student stu) {
		// TODO Auto-generated method stub
		return stuDao.updateStu(stu);
	}


	@Override
	public int deleteStu(String stuID) {
		// TODO Auto-generated method stub
		return stuDao.deleteStu(stuID);
	}
	
	
	
	

}
