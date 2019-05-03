package com.program.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
=======
>>>>>>> 716e58f349dd8735c687fb316ebeb5cf0b97dba4

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

<<<<<<< HEAD
	
	@Bean
	public InternalResourceViewResolver setupViewResolver(){
	   InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	   resolver.setPrefix("/src/main/resources/mapper/");
	   resolver.setSuffix(".jsp");
	   return resolver;

	}

=======
>>>>>>> 716e58f349dd8735c687fb316ebeb5cf0b97dba4
}
