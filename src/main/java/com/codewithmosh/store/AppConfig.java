package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${stripe.payment_method}")
    private String payment_method;

    @Bean
    public StripePaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaypalPaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if(payment_method.equals("stripe"))
            return new OrderService(stripe());
        else
            return new OrderService(paypal());
    }
}
