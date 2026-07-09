package Questions.ParkingLot.V4.Objects;

import Questions.ParkingLot.V4.enums.VehicleTypes;

public class Vehicle {
    String number;
    VehicleTypes vehicleType;

    public Vehicle(String number,VehicleTypes types){
        this.number=number;
        this.vehicleType=types;
    }

    public String getNumber() {
        return number;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleType;
    }
}
