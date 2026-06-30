package Questions.ParkingLot.V1.objects;

import Questions.ParkingLot.V1.enums.VehicleType;

import java.time.LocalDateTime;

public class Ticket {
    int id;
    VehicleType vehicleType;
    String vehicleNumber;
    LocalDateTime time;
    int spot;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        this.spot = spot;
    }

}
