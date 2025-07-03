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
		var user = User.builder()
				.name("Ketan")
				.email("ketan.kumar@gmail.com")
				.password("password")
				.build();
		System.out.println(user);
	}

}
