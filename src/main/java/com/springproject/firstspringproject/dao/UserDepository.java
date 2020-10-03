package com.springproject.firstspringproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.springproject.firstspringproject.entities.User;


public interface UserDepository extends CrudRepository<User, Integer> {

}
