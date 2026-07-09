package Questions.ParkingLot.V4.Objects;

import Questions.ParkingLot.V4.PaymentStrategy.PaymentStrategy;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy ps){
        this.paymentStrategy=ps;
    }

    boolean processPayment(int amount){
        return paymentStrategy.pay(amount);
    }
}
