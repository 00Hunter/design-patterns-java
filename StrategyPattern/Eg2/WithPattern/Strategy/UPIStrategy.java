package StrategyPattern.Eg2.WithPattern.Strategy;

public class UPIStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paying through UPI"+amount);
    }
}
