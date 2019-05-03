package com.program.demo.service.impl;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.demo.dao.TeacherReleaseDao;
import com.program.demo.dao.TeacherSignDao;
import com.program.demo.entity.HomeWork;
import com.program.demo.entity.Teacher;
import com.program.demo.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private TeacherSignDao teacherSignDao;
	@Autowired
	private TeacherReleaseDao teacherReleaseDao;
	@Override
	public Teacher Login(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherSignDao.TeacherLogin(teacher);
	}

	@Override
	public int Register(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherSignDao.TeacherRegister(teacher);
	}

	

	@Override
	public HomeWork Release(String teacherID,String workName, Date deadline) {
		// TODO Auto-generated method stub
		int workID = teacherReleaseDao.getWorkID()+1;
		HomeWork work = new HomeWork(workID,"123",workName,deadline);
		teacherReleaseDao.Release(work);
		return work;
	}
	
}
