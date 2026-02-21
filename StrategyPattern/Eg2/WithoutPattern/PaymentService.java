package StrategyPattern.Eg2.WithoutPattern;

public class PaymentService {
    public void processPayment(String type, int amount) {

        if (type.equals("UPI")) {
            System.out.println("Validating UPI details...");
            System.out.println("Paid " + amount + " using UPI");
        }

        else if (type.equals("CARD")) {
            System.out.println("Validating Card details...");
            System.out.println("Paid " + amount + " using Card");
        }

        else if (type.equals("CRYPTO")) {
            System.out.println("Validating Wallet...");
            System.out.println("Paid " + amount + " using Crypto");
        }

        else {
            System.out.println("Invalid payment type");
        }
    }
}
