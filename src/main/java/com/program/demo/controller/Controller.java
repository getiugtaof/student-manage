package com.program.demo.controller;


import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.program.demo.entity.Student;
import com.program.demo.entity.Teacher;
import com.program.demo.service.*;

@RestController
@RequestMapping("/superadmin")
public class Controller {
	@Autowired
	private StuService stuService; 
	private TeacherService teacherService;
	
	
	@RequestMapping(value="/stuLogin",method = RequestMethod.GET)
	private Map<String,Object> stulogin(@RequestBody Student stu){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		//学生登录
		Student list = stuService.Login(stu);
		modelMap.put("StuLogin",list);
		return modelMap;
	}
	
	@RequestMapping(value = "/stuRegister", method = RequestMethod.POST)
	private Map<String, Object> stuRegister(@RequestBody Student stu)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 学生注册
		modelMap.put("success", stuService.Register(stu));
		return modelMap;
	}
	
	@RequestMapping(value="/teacherLogin",method = RequestMethod.GET)
	private Map<String,Object> teacherlogin(@RequestBody Teacher teacher){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		//教师登录
		Teacher list = teacherService.Login(teacher);
		modelMap.put("TeacherLogin",list);
		return modelMap;
	}
	
	@RequestMapping(value = "/teacherRegister", method = RequestMethod.POST)
	private Map<String, Object> TeacherRegister(@RequestBody Teacher teacher)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 教师注册
		modelMap.put("success", teacherService.Register(teacher));
		return modelMap;
	}
	
	@RequestMapping(value = "/teacherRelease", method = RequestMethod.POST)
	private Map<String, Object> TeacherRelease(@RequestBody String teacherID,@RequestBody String workName,@RequestBody Date deadline)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 教师发布作业
		modelMap.put("success", teacherService.Release(teacherID,workName,deadline));
		return modelMap;
	}
	
	@RequestMapping(value = "/stuUpload", method = RequestMethod.POST)
	private Map<String, Object> StuUpload(@RequestBody String stuID,@RequestBody String workID,@RequestBody Double size)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 学生上传作业
		modelMap.put("success", stuService.Upload(stuID,workID,size));
		return modelMap;
	}
	
	
}
