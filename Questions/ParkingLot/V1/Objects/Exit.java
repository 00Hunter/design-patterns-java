package Questions.ParkingLot.V1.Objects;

import Questions.ParkingLot.V1.ParkingSpotManager;
import Questions.ParkingLot.V1.PaymentProcessor.PaymentStrategy;

public class Exit {
    int id;
    ParkingSpotManager parkingSpotManager;

    public Exit (ParkingSpotManager ps){
        this.parkingSpotManager=ps;
    }

    public void RemoveVehicle(Ticket t, PaymentStrategy paymentStrategy){
        paymentStrategy.Pay(t.getAmmout());
        parkingSpotManager.RemoveVehicle(t.getVehicle());
    }


}
