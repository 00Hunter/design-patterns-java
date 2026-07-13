package Questions.ParkingLot.V5.Objects;

import Questions.ParkingLot.V5.PaymentStrategy.Implementation.CardPaymentStrategy;
import Questions.ParkingLot.V5.PaymentStrategy.Implementation.CashPaymentStrategy;
import Questions.ParkingLot.V5.PaymentStrategy.Implementation.UPIPaymentStrategy;
import Questions.ParkingLot.V5.PaymentStrategy.PaymentStrategy;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    Map<String, PaymentStrategy>paymentStrategyMap;

    public PaymentService(){
        paymentStrategyMap=new HashMap<>();
        paymentStrategyMap.put("UPI",new UPIPaymentStrategy());
        paymentStrategyMap.put("CARD",new CardPaymentStrategy());
        paymentStrategyMap.put("CASH",new CashPaymentStrategy());
    }

    boolean processPayment(String mode,double amount) {
        PaymentStrategy ps = paymentStrategyMap.get(mode.toUpperCase());

        if (ps == null) {
            System.out.println("Invalid payment mode");
            return false;
        }

        boolean success = ps.pay(amount);

        if (!success) {
            System.out.println("Payment failed");
            return false;
        }

        System.out.println("Payment of amount " + amount + " is successful");
        return true;
    }
}
