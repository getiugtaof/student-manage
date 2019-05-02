package com.program.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.program.demo.entity.HomeAccess;
import com.program.demo.entity.StudentAcesss;
import com.program.demo.service.HomeWorkService;
import com.program.demo.service.StuAccessService;

@RestController
@RequestMapping("/Stu")
public class StuAccess {
	
	@Autowired
	private StuAccessService  stuAccessService;
	@RequestMapping(value="/Access",method = RequestMethod.GET)
	private Map<String,Object> Comments(HttpServletRequest request, HttpServletResponse response){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		//查询学生信息
		String StuID=request.getParameter("stuid");//充视图中获得学生属性。
		String workid=request.getParameter("workid");
		String comments=request.getParameter("stucomments");
		
		StudentAcesss stuAccess =new StudentAcesss();
		int workId=Integer.parseInt(workid);
		stuAccess.setStuId(StuID);
		stuAccess.setWorkId(workId);
		stuAccess.setStuComments(comments);
		System.out.println(stuAccess.getStuId()+"   "+stuAccess.getStuComments()+"   "+stuAccess.getWorkId());
		modelMap.put("success", stuAccessService.insertStuAccess(stuAccess));
		return modelMap;
	}
	

}
