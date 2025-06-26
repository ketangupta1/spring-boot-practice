package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class PaypalPaymentService implements PaymentService {
    @Value("${stripe.enabled}")
    private boolean isEnabled;

    @Value("${stripe.supported_currencies}")
    private List supported_currencies;

    @Override
    public void processPayment(double amount){
        System.out.println("Paypal");
        System.out.println("Enable: "+ isEnabled);
        System.out.println("Supported Currencies: "+ supported_currencies);
        System.out.println("Payment received: "+ amount);
    }
}
