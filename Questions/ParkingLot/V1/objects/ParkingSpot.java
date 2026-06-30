package Questions.ParkingLot.V1.objects;

import Questions.ParkingLot.V1.enums.VehicleType;

public class ParkingSpot {
    String vehicleNumber;
    VehicleType vehicleType;
    boolean isOccuipied;

    public ParkingSpot(VehicleType type){
        this.vehicleType=type;
        this.isOccuipied=false;
    }

    boolean ParkVehcile(){
       setOccuipied(true);
        return true;
    }

    boolean RemoveVehicle(){
            setOccuipied(false);
            return true;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isParkingSpotEmpty() {
        return !this.isOccuipied;
    }

    public void setOccuipied(boolean occuipied) {
        this.isOccuipied = occuipied;
    }
}
