package com.paymybuddy.app;

import com.paymybuddy.app.model.User;
import com.paymybuddy.app.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Clock;

@SpringBootApplication
public class PayMyBuddyApplication implements CommandLineRunner {

	private UserService userService;

	public PayMyBuddyApplication(UserService userService){
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PayMyBuddyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Iterable<User> usersBefore = userService.getUsers();
//		usersBefore.forEach(user -> System.out.println(user.getLastname()));
//
//		User newUser = new User();
//		newUser.setFirstname("firstnameNew");
//		newUser.setLastname("lastnameNew");
//		newUser.setEmail("emailNew");
//		userService.addUser(newUser);
//
//		Iterable<User> usersAfter = userService.getUsers();
//		usersAfter.forEach(user -> System.out.println(user.getLastname()));
//
//		userService.deleteUserById(7);
//
//		Iterable<User> usersAfterAfter = userService.getUsers();
//		usersAfterAfter.forEach(user -> System.out.println(user.getLastname()));
	}
}
