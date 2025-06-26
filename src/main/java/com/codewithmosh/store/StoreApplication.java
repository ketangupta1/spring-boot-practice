package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
//		var orderServiceStripe = new OrderService(new StripePaymentService());
//		orderServiceStripe.placeOrder();
		var orderServicePaypal = new OrderService(new PaypalPaymentService());
		orderServicePaypal.placeOrder();
	}

}
