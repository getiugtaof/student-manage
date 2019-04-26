package com.program.demo.service;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.sql.Date;
import com.program.demo.entity.HomeWork;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherServiceTest {
	@Autowired
	private TeacherService tea;
	@Test
	public void testRelease() {
		Date date = new Date(System.currentTimeMillis());
		HomeWork a = tea.Release("2010", "second-work", date);
		assertEquals(4, a.getWorkID().intValue());
	}

}
