package com.program.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.demo.dao.HomeWorkAccessDao;
import com.program.demo.entity.HomeAccess;
import com.program.demo.service.HomeWorkService;
@Service
public class HomeWorkServiceImpl implements HomeWorkService{
	@Autowired
	private HomeWorkAccessDao  HomeWorkAccessDao;
	@Override
	public int insertAccess(HomeAccess home) {
		return HomeWorkAccessDao.HomeWorkAccess(home);
	}

}
