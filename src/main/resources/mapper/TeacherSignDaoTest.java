package com.program.demo.dao;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.program.demo.entity.Teacher;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherSignDaoTest {
	@Autowired
	private TeacherSignDao tea;
	@Test
	@Ignore
	public void testTeacherLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testTeacherRegister() {
		Teacher tea1 = new Teacher("2010","123","123","123");
		int a = tea.TeacherRegister(tea1);
		assertEquals(1, a);
	}

}
