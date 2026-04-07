package Questions.ParkingLot.V1.Objects;

public class Ticket {
    int id;
    Vehicle vehicle;
    int ammount;
    ParkingSpot parkingSpot;

    public Ticket(int id,Vehicle v,ParkingSpot ps){
        this.id=id;
        this.vehicle=v;
        this.parkingSpot=ps;
    }

    public int getAmmout(){
        return this.ammount;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }


    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
