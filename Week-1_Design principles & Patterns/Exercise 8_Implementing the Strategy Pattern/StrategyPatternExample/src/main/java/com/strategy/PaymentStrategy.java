package com.strategy;

public interface PaymentStrategy {
    boolean pay(double amount);
    String getPaymentMethod();
}
