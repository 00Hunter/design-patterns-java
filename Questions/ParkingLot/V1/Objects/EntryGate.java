package Questions.ParkingLot.V1.Objects;

import Questions.ParkingLot.V1.ParkingSpotManager;

public class EntryGate {
    int id;
    ParkingSpotManager parkingSpotManager;
    static int ticketNumber;

    public EntryGate(ParkingSpotManager ParkingSpotManager){
        this.parkingSpotManager= ParkingSpotManager;
    }
    //Park vehicle
    public Ticket parkVehicle(Vehicle v){
       ParkingSpot newParking= parkingSpotManager.ParkVehicle(v);
        Ticket newTicket=new Ticket(ticketNumber,v,newParking);
        ticketNumber++;
        return newTicket;

    }
    //find parking spot will be added in new design

}
