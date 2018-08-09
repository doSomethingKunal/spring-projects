package com.in28minutes.springboot.H2InMemoryDbDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.H2InMemoryDbDemo.entity.User;
import com.in28minutes.springboot.H2InMemoryDbDemo.service.UserService;

@Component
public class UserEntityManagerCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserEntityManagerCommandLineRunner.class);
	
	@Autowired
	private UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		User tom = new User("Tom", "Admin");
		userService.insert(tom);
		log.info("inserted tom ----> "+tom);
		log.info("Finding the user with id 1L -----------> "+userService.find(1L).toString());
		log.info("Finding all the users -----------> "+userService.findAll().toString());
	}

}
