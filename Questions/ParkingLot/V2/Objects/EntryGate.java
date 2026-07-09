package Questions.ParkingLot.V2.Objects;

import Questions.ParkingLot.V2.enums.Status;
import Questions.ParkingLot.V2.enums.VehicleTypes;
import Questions.ParkingLot.V2.Objects.ParkingSpotManager;
import Questions.ParkingLot.V2.Objects.Ticket;
import Questions.ParkingLot.V2.Objects.Vehicle;

import java.time.LocalDateTime;

public class EntryGate {
    ParkingSpotManager parkingSpotManager;


    public EntryGate(ParkingSpotManager parkingSpotManager){
        this.parkingSpotManager=parkingSpotManager;
    }

    public int FindParkingSpot(Vehicle v){
            int spot=parkingSpotManager.FindParkingSpot(v);
            return spot;
    }

   public Ticket GenerateTicket(Vehicle vehicle){
        int spot=FindParkingSpot(vehicle);
        if(spot!=-1){
            Ticket ticket=new Ticket();
            ticket.setVehicle(vehicle);
            ticket.setParkingTime(LocalDateTime.now());
            ticket.setStatus(Status.ACTIVE);
            return ticket;
        }
        return null;
    }
}
