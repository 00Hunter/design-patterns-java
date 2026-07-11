package Questions.ParkingLot.V4.PaymentStrategy.Implementation;

import Questions.ParkingLot.V4.PaymentStrategy.PaymentStrategy;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        return true;
    }
}
