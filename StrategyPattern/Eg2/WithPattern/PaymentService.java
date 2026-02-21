package StrategyPattern.Eg2.WithPattern;

import StrategyPattern.Eg2.WithPattern.Strategy.PaymentStrategy;

public class PaymentService {
    PaymentStrategy paymentMethod;

    public PaymentService(PaymentStrategy paymentMethod){
        this.paymentMethod=paymentMethod;
    }
    public void processPayment (int amount){
        paymentMethod.pay(amount);
    }
}
