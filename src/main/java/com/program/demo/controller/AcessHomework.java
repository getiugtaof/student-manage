package com.program.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.program.demo.entity.HomeAccess;
import com.program.demo.entity.Student;
import com.program.demo.service.HomeWorkService;

@RestController
@RequestMapping("/HomeWork")
public class AcessHomework {
	@Autowired
	private HomeWorkService  homeWorkService;
	@RequestMapping(value="/insertComments",method = RequestMethod.GET)
	private Map<String,Object> Comments(HttpServletRequest request, HttpServletResponse response){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		//查询学生信息
		String StuID=request.getParameter("stuid");//充视图中获得学生属性。
		String workid=request.getParameter("workid");
		String  score=request.getParameter("score");
		String comments=request.getParameter("comments");
		
		HomeAccess homeInfor =new HomeAccess();
		int workId=Integer.parseInt(workid);
		int teacherScore=Integer.parseInt(score);
		homeInfor.setStuID(StuID);
		homeInfor.setScore(teacherScore);
		homeInfor.setTeacherComments(comments);
		homeInfor.setWorkId(workId);
		System.out.println(homeInfor.getStuID()+"   "+homeInfor.getScore()+"   "+homeInfor.getTeacherComments()+"   "+homeInfor.getWorkId());
		modelMap.put("success", homeWorkService.insertAccess(homeInfor));
		return modelMap;
	}
	

}
