package com.program.demo.dao;

import static org.junit.Assert.*;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.program.demo.entity.Student;




@RunWith(SpringRunner.class)
@SpringBootTest
public class StuSignDaoTest {
	
	@Autowired
	private StuSignDao stuSignDao;
	
	@Test
	public void testStuLogin() {
		Student stu = new Student("123","123","123");
		Student a = stuSignDao.StuLogin(stu);
		
		assertEquals(stu.getStuID(), a.getStuID());
		
	}

	@Test
	
	public void testStuRegister() {
		Student stu = new Student("123","123","123");
		int a = stuSignDao.StuRegister(stu);
		assertEquals(1, a);
	}

}
