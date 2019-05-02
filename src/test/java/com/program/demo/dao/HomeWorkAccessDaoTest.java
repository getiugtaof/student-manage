package com.program.demo.dao;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.program.demo.entity.HomeAccess;
@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeWorkAccessDaoTest {
	@Autowired
	private  HomeWorkAccessDao HomeWorkAccessDao;
	@Test
	public void HomeWorkAccesstest() {
		HomeAccess homeInfor =new HomeAccess();
		homeInfor.setStuID("20");
		homeInfor.setScore(12);
		homeInfor.setTeacherComments("啦啦啦");
		homeInfor.setWorkId(23);
		int a = HomeWorkAccessDao.HomeWorkAccess(homeInfor);	
	}
}
