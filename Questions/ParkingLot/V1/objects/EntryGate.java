package Questions.ParkingLot.V1.objects;

import Questions.ParkingLot.V1.enums.VehicleType;

public class EntryGate {
    ParkingSpotManager parkingSpotManager;


    public EntryGate(ParkingSpotManager parkingSpotManager){
        this.parkingSpotManager=parkingSpotManager;
    }

    public int FindParkingSpot(VehicleType type){
            int spot=parkingSpotManager.findParkingSpot(type);
            return spot;
    }

   public Ticket GenerateTicket(String vehicleNumber,VehicleType type){
        int spot=FindParkingSpot(type);
        if(spot!=-1){
            Ticket ticket=new Ticket();
            ticket.setVehicleNumber(vehicleNumber);
            ticket.setVehicleType(type);
            ticket.setSpot(spot);
            return ticket;
        }
        return null;
    }
}
