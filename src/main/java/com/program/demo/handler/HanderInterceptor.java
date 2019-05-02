package com.program.demo.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.platform.engine.EngineDiscoveryRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mchange.lang.StringUtils;

public class HanderInterceptor extends HandlerInterceptorAdapter{
	
	private final String username="zhang";
	private final String pwd="123";
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handle)
	throws Exception
	{
		System.out.println("preHandle statrt.....");
         String usernameParam=request.getParameter("username");
         String pwdParam=request.getParameter("pwd");
         if(usernameParam!=null&&pwdParam!=null)
         {
        	 if(usernameParam.equals(username)&&pwdParam.equals(pwd))
        	 {
        		 return true;
        	 }
        	 else {
        		 response.sendRedirect(request.getContextPath()+"/test");
        			return false;
        	 }
         }
         else
        	 return false;
		

	}

}
