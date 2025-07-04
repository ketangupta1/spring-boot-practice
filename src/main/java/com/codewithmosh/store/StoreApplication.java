package com.codewithmosh.store;

import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Alt+Insert to generate context menu

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var repository = context.getBean(UserRepository.class);

		var user = User.builder()
				.name("Ketan")
				.email("ketan.kumar@gmail.com")
				.password("password")
				.build();

		repository.save(user);
		var user1 = repository.findById(3L).orElseThrow();

		System.out.println(user1);

		repository.delete(user1);
	}

}
