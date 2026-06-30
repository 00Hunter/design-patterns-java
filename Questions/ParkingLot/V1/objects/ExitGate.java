package Questions.ParkingLot.V1.objects;

import java.time.LocalDateTime;

public class ExitGate {
    Ticket ticket;
    ParkingSpotManager parkingSpotManager;
    public ExitGate(Ticket ticket,ParkingSpotManager parkingSpotManager){
        this.ticket=ticket;
        this.parkingSpotManager=parkingSpotManager;
    }

  public  boolean RemoveVehicle(){
        parkingSpotManager.list.get(ticket.spot).setOccuipied(false);
        return true;
    }

    public void MakePayment(){
        System.out.println(ticket.getTime());
    }

    public void GenerateReceipt(){
        System.out.println("payment done ");
    }

    public void ExitVehicle(Vehicles vehicle){
        MakePayment();
        RemoveVehicle();
        GenerateReceipt();
    }

}
