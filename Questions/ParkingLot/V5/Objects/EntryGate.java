package Questions.ParkingLot.V5.Objects;

import Questions.ParkingLot.V5.enums.Status;

import java.time.LocalDateTime;

public class EntryGate {
    ParkingLotManager parkingLotManager;

    public EntryGate(ParkingLotManager plm){
        this.parkingLotManager=plm;
    }

    public SpotAllocation FindParkingSpot(Vehicle vehicle){
        SpotAllocation newspot=parkingLotManager.FindParkingSpot(vehicle);

        if (newspot==null){
            System.out.println("Cannot assign any parkingSpot Try again later");
            return null;
        }

        return newspot;
    }

    public Ticket GenerateTicket(Vehicle vehicle){
        SpotAllocation newspot= FindParkingSpot(vehicle);
        if(newspot==null){
            return null;
        }
        ParkingSpot spot=parkingLotManager.getParkingSpot(newspot.getFloorId(), newspot.getSpotId());
        spot.ParkVehicle(vehicle);

        Ticket newTicket=new Ticket();
        newTicket.setFloor(newspot.getFloorId());
        newTicket.setVehicle(vehicle);
        newTicket.setParkspotId(newspot.getSpotId());
        newTicket.setParkingTime(LocalDateTime.now());
        newTicket.setStatus(Status.ACTIVE);

        return newTicket;
    }
}
