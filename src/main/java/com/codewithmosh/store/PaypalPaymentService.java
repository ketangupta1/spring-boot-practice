package com.codewithmosh.store;

public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount){
        System.out.println("Paypal");
        System.out.println("Payment received: "+ amount);
    }
}
