package StrategyPattern.Eg2.WithPattern.Strategy;

public class CashStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying thorugh cash "+amount);
    }
}
