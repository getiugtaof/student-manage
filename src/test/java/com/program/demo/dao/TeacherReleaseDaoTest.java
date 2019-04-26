package com.program.demo.dao;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.program.demo.entity.HomeWork;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherReleaseDaoTest {
	@Autowired
	private TeacherReleaseDao tea;
	@Test
	@Ignore
	public void testRelease() {
		Date date = new Date(System.currentTimeMillis());
		HomeWork work = new HomeWork(2,"123","first-work",date);
		tea.Release(work);
	}

	@Test
	
	public void testGetCourseName() {
		String courseName = tea.getCourseName("2016");
		assertEquals("math", courseName);
	}
	@Test
	public void testGetWorkID() {
		int workID = tea.getWorkID()+1;
		assertEquals(3, workID);
	}

}
