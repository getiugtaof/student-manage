package com.program.demo.config.handle;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


import com.program.demo.handler.HanderInterceptor;


@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport
{
     public void addInterceptors(InterceptorRegistry registry) 
    {
    	 registry.addInterceptor(new HanderInterceptor()).addPathPatterns("/superadmin/*");
		super.addInterceptors(registry);
	}
}
