package com.codewithmosh.store;

import com.codewithmosh.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Alt+Insert to generate context menu

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var user = new User();
		user.setName("Ketan");
		user.setEmail("ketankumar@gmail.com");
		user.setPassword("password");
		System.out.println(user);
	}

}
