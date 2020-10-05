package com.springproject.firstspringproject.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.springproject.firstspringproject.entities.User;


public interface UserDepository extends CrudRepository<User, Integer> {

    public List<User> findByName(String name);
    public List<User> findByCity(String city);

    @Query("select u from User u")
    public List<User> getAllUser();

    @Query("select u from User u WHERE u.name =:n and u.city =:c")
    public List<User> getUserByName(@Param("n") String n, @Param("c") String c);

    @Query(value = "select * from user", nativeQuery = true)
    public List<User> getUsers();

}
