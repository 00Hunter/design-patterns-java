package Questions.ParkingLot.V1.PaymentProcessor;

public class CardStrategy implements PaymentStrategy{
    @Override
    public boolean Pay(int amount) {
        System.out.println("Initiating the payment through Card payment method");
        return true;
    }
}
