package com.program.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.demo.dao.HomeWorkAccessDao;
import com.program.demo.dao.StudentAccessDao;
import com.program.demo.entity.HomeAccess;
import com.program.demo.entity.StudentAcesss;
import com.program.demo.service.StuAccessService;
@Service
public class StuAccessServiceImpl implements StuAccessService{
	
	@Autowired
	private StudentAccessDao  studentAccessDao;
	@Override
	public int insertStuAccess(StudentAcesss stuaccess) {
		return studentAccessDao.StudentAccess(stuaccess);
	}


}
