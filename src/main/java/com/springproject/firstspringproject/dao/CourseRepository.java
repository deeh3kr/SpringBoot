package com.springproject.firstspringproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.springproject.firstspringproject.entities.Course;
import com.springproject.firstspringproject.entities.User;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
