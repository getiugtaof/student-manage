package com.program.demo.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.program.demo.entity.Student;
@RunWith(SpringRunner.class)
@SpringBootTest
class StuServiceTest {
	@Autowired
	private StuService stuService;
	@Test
	void testQueryStu() {
		List<Student> stuList = stuService.queryStuList();
		assertEquals(1, stuList.size());
	}

}
