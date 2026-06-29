package Questions.ParkingLot.V1.objects;

import Questions.ParkingLot.V1.enums.VehicleType;
import StrategyPattern.WithStrategyPattern.Vehicle;

public class Vehicles {
    String vehicleNumber;
    VehicleType vehicletype;


    public Vehicles(String vehicleNumber,VehicleType type){
        this.vehicletype=type;
        this.vehicleNumber=vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setType(VehicleType type) {
        this.vehicletype = type;
    }
}
