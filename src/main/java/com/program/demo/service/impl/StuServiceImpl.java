package com.program.demo.service.impl;

<<<<<<< HEAD
import java.util.List;
=======


import java.sql.Date;
>>>>>>> 716e58f349dd8735c687fb316ebeb5cf0b97dba4

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.program.demo.dao.StuDao;
=======
import com.program.demo.dao.StuAssessDao;
import com.program.demo.dao.StuSignDao;
import com.program.demo.dao.StuUploadDao;
import com.program.demo.entity.Assess;
>>>>>>> 716e58f349dd8735c687fb316ebeb5cf0b97dba4
import com.program.demo.entity.Student;
import com.program.demo.service.StuService;

@Service
public class StuServiceImpl implements StuService{
	@Autowired
<<<<<<< HEAD
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
	
	
=======
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

>>>>>>> 716e58f349dd8735c687fb316ebeb5cf0b97dba4
	
	

}
