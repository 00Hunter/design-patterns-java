package Questions.ParkingLot.V3.Objects;

import Questions.ParkingLot.V3.enums.VehicleTypes;

public class ParkingSpot {
    int id;
    Vehicle vehicle;
    VehicleTypes vehicletype;
    boolean isOccupied;

    public ParkingSpot(int id, VehicleTypes types){
        this.id=id;
        this.vehicletype=types;
        this.isOccupied=false;
    }

    public boolean ParkVehicle(Vehicle vehicleToPark){
        if(vehicletype.equals(vehicleToPark.getVehicleTypes()) && this.isOccupied==false){
                this.vehicle=vehicleToPark;
                this.isOccupied=true;
                return true;
        }
        return false;
    }

    public boolean RemoveVehicle(){
        this.isOccupied=false;
        this.vehicle=null;
        return true;
    }

    public boolean CanPark(Vehicle vehicle){
        return (vehicle.getVehicleTypes().equals(this.vehicletype) && isOccupied==false);
    }
}
