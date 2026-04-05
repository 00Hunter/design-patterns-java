package Questions.ParkingLot.V1.Objects;



abstract public class ParkingSpot {
    int id;
    Vehicle vehicle;
    boolean occupied;



    public void ParkVehicle(Vehicle v){
        this.vehicle=v;
        this.occupied=true;
    }
    public void RemoveVehilce(){
        this.occupied=false;
    }

    public boolean getStatus(){
        return this.occupied;
    }

}
