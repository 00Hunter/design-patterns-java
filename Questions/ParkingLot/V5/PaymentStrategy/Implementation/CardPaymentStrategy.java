package Questions.ParkingLot.V5.PaymentStrategy.Implementation;

import Questions.ParkingLot.V5.PaymentStrategy.PaymentStrategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        return true;
    }
}
