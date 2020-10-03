package com.springproject.firstspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.springproject.firstspringproject.entities.Course;
//import com.springproject.firstspringproject.services.CourseService;



@Controller
public class TestController {
	
	@Autowired
//	private CourseService courseService;
	
	@RequestMapping("/")
	public String homehandler()
	{
		System.out.println("Home Page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("Contact Page");
		return "contact";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String handler()
	{
		return "First Handler";
	}
	
	//---------------------------------------------
	
//	@GetMapping("/courses")
//	public List<Course> getCourses()
//	{
//		return this.courseService.getCourses();
//	}
//	
//	@GetMapping("/courses/{courseId}")
//	public Course getCourse(@PathVariable String courseId) {
//		return this.courseService.getCourse(Long.parseLong(courseId));
//	}
//	
//	@PostMapping("/courses")
//	public Course addCourse(@RequestBody Course course)
//	{
//		return this.courseService.addCourse(course);
//	}
//	
//	@PutMapping("/courses")
//	public Course updateCourse(@RequestBody Course course)
//	{
//		return this.courseService.updateCourse(course);
//	}
//	
//	@DeleteMapping("/courses/{courseId}")
//	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
//	{
//		try {
//			this.courseService.deleteCourse(Long.parseLong(courseId));
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (Exception e){
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	


}
