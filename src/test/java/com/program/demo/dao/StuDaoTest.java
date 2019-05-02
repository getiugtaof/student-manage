package com.program.demo.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.program.demo.entity.Student;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StuDaoTest {
	@Autowired
	private StuDao stuDao;
	
	@Test
	
	public void testQueryStu() {
		List<Student> stuList = stuDao.queryStu();
		assertEquals(2, stuList.size());
	}

	@Test
	@Ignore
	public void testInsertStu() {
		Student student = new Student();
		student.setStuID("2016057");
		student.setStuName("123");
		student.setPassword("123");
		int a = stuDao.insertStu(student);
		assertEquals(1, a);
	}

	@Test
	@Ignore
	public void testUpdateStu() {
		Student student = new Student();
		student.setStuID("2016058");
		student.setStuName("128");
		student.setPassword("123");
		int a = stuDao.updateStu(student);
		assertEquals(1, a);
	}

	@Test
	@Ignore
	public void testDeleteStu() {
		String stuID = "2016057";
		int a = stuDao.deleteStu(stuID);
		assertEquals(1, a);
	}

}
