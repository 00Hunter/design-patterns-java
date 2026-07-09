package Questions.ParkingLot.V4.PaymentStrategy.Implementation;

import Questions.ParkingLot.V4.PaymentStrategy.PaymentStrategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(int amount) {
        return false;
    }
}
