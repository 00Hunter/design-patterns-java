package Questions.ParkingLot.V1.PaymentProcessor;

public class UpiStrategy implements PaymentStrategy{
    @Override
    public boolean Pay(int amount) {
        System.out.println("Initiaing the payment through UPI");
        return true;
    }
}
