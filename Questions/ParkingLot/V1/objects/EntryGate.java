package Questions.ParkingLot.V1.objects;

import Questions.ParkingLot.V1.enums.VehicleType;

import java.time.LocalDateTime;

public class EntryGate {
    ParkingSpotManager parkingSpotManager;


    public EntryGate(ParkingSpotManager parkingSpotManager){
        this.parkingSpotManager=parkingSpotManager;
    }

    public int FindParkingSpot(VehicleType type){
            int spot=parkingSpotManager.findParkingSpot(type);
            return spot;
    }

   public Ticket GenerateTicket(Vehicles vehicle){
        int spot=FindParkingSpot(vehicle.getVehicletype());
        if(spot!=-1){
            Ticket ticket=new Ticket();
            ticket.setVehicleNumber(vehicle.getVehicleNumber());
            ticket.setVehicleType(vehicle.getVehicletype());
            ticket.setSpot(spot);
            ticket.setTime(LocalDateTime.now());
            return ticket;
        }
        return null;
    }
}
