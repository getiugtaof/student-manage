package com.program.demo.service.impl;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.demo.dao.StuAssessDao;
import com.program.demo.dao.StuSignDao;
import com.program.demo.dao.StuUploadDao;
import com.program.demo.entity.Assess;
import com.program.demo.entity.Student;
import com.program.demo.service.StuService;

@Service
public class StuServiceImpl implements StuService{
	@Autowired
	private StuSignDao stuSignDao;
	private StuUploadDao stuUploadDao;
	private StuAssessDao stuAssessDao;

	@Override
	public Student Login(Student stu) {
		// TODO Auto-generated method stub
		return stuSignDao.StuLogin(stu);
	}

	@Override
	public int Register(Student stu) {
		// TODO Auto-generated method stub
		return stuSignDao.StuRegister(stu);
	}

	@Override
	public Assess Upload(String stuID, String workID, Double size) {
		// TODO Auto-generated method stub
		Date uploadTime = new Date(System.currentTimeMillis());
		Assess assess = new Assess(stuID,workID,uploadTime,size,null,null,null);
		return assess;
	}

	
	

}
