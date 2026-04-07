package Questions.ParkingLot.V1.PaymentProcessor;


public class PaymentService {
    PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy ps){
        this.paymentStrategy=ps;
    }

    public boolean ProcessPayment(int amount ){
        return paymentStrategy.Pay(amount);
    }
}
