package Questions.ParkingLot.V1.objects;

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
        System.out.println(10* ticket.getTime());
    }

    public void GenerateReceipt(){
        System.out.println("payment done ");
    }

}
