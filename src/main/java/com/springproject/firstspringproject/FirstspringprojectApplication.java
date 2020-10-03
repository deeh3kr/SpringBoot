package com.springproject.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.springproject.firstspringproject.entities.*;
import com.springproject.firstspringproject.dao.CourseRepository;
import com.springproject.firstspringproject.dao.UserDepository;

@SpringBootApplication(scanBasePackages={
		" com.springproject.firstspringproject.controllers"})
public class FirstspringprojectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(FirstspringprojectApplication.class, args);
		UserDepository userDepository = context.getBean(UserDepository.class);
		CourseRepository courseRepository = context.getBean(CourseRepository.class);
		
		User user = new User();
		user.setName("Deepanshu");
		user.setCity("Alwar");
		User user1 = userDepository.save(user);
		System.out.println(user1);
		
		Course course = new Course();
		course.setdescription("Desc");
		course.setTitle("Title");
		Course course1 = courseRepository.save(course);
		System.out.println(course1);
	}

}
