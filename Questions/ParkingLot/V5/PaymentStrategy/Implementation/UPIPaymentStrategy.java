package Questions.ParkingLot.V5.PaymentStrategy.Implementation;

import Questions.ParkingLot.V5.PaymentStrategy.PaymentStrategy;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        return true;
    }
}
