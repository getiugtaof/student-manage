package com.program.demo.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.program.demo.entity.Student;
import com.program.demo.service.StuService;

@RestController
@RequestMapping("/superadmin")
public class Controller {
	@Autowired
	private StuService stuService;
	
	@RequestMapping(value="/liststu",method = RequestMethod.GET)
	private Map<String,Object> listStu(){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		//查询学生信息
		List<Student> list = stuService.queryStuList();
		modelMap.put("queryStu",list);
		return modelMap;
	}
	
	@RequestMapping(value = "/insertstu", method = RequestMethod.POST)
	private Map<String, Object> addStu(@RequestBody Student stu)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 添加学生信息
		modelMap.put("success", stuService.insertStu(stu));
		return modelMap;
	}
	
	@RequestMapping(value = "/modifystu", method = RequestMethod.POST)
	private Map<String, Object> modifyStu(@RequestBody Student stu)
			throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 修改学生信息
		modelMap.put("success", stuService.modifyStu(stu));
		return modelMap;
	}
	
	@RequestMapping(value = "/removestu", method = RequestMethod.GET)
	private Map<String, Object> removeStu(String stuID) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		// 删除学生信息
		modelMap.put("success", stuService.deleteStu(stuID));
		return modelMap;
	}
	
	
}
