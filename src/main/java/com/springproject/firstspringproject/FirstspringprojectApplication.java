package com.springproject.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.springproject.firstspringproject.entities.User;

import java.util.List;
import java.util.Optional;

import com.springproject.firstspringproject.dao.UserDepository;

// @SpringBootApplication(scanBasePackages={
// 		" com.springproject.firstspringproject.controllers"})

@SpringBootApplication
public class FirstspringprojectApplication {

	public static void main(String[] args) {
		
		// ApplicationContext context = SpringApplication.run(FirstspringprojectApplication.class, args);
		// UserDepository userDepository = context.getBean(UserDepository.class);
		
		// User user = new User();
		// user.setName("Deepanshu");
		// user.setCity("Alwar");
		// User user1 = userDepository.save(user);
		// System.out.println(user1);
		// user = new User();
		// user.setCity("Jaipur");
		// user.setName("Nitin");
		// user1 = userDepository.save(user);
		// System.out.println(user1);
		// user = new User();
		// user.setCity("Alwar");
		// user.setName("Akhil");
		// user1 = userDepository.save(user);
		// System.out.println(user1);

		//Updating and getting entity data

		// Optional<User> optional = userDepository.findById(2);
		// User user = optional.get();
		// user.setName("Jatin");
		// User result = userDepository.save(user);

		// System.out.println(result);

		//getting all data
		// Iterable<User> itr = userDepository.findAll();
		// itr.forEach(user->{
		// 	System.out.println(user);
		// });
		
		//Delete by ID
		//userDepository.deleteById(2);

		//Deleet all entities
		// Iterable<User> itr = userDepository.findAll();
		// itr.forEach(user2->{
		// 	System.out.println(user2);
		// });
		// userDepository.deleteAll(itr);
		
		//Custom Finder

		//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
		
		//List<User> findByCity = userDepository.findByCity("Alwar");

		//List<User> findByCity = userDepository.getAllUser();

		// findByCity.forEach(e->{
		// 	System.out.println(e);
		// });

		// List<User> userByName = userDepository.getUserByName("Nitin", "Jaipur");
		// userByName.forEach(e->{
		// 	System.out.println(e);
		// });

		// List<User> users = userDepository.getUsers();
		// users.forEach(e->{
		// 	System.out.println(e);
		// });

		SpringApplication.run(FirstspringprojectApplication.class, args);
	}

}
