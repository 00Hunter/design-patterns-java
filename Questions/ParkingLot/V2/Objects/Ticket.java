package Questions.ParkingLot.V2.Objects;

import Questions.ParkingLot.V2.enums.Status;

import java.time.LocalDateTime;

public class Ticket {
    int id;
    Vehicle vehicle;
    LocalDateTime parkingTime;
    Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(LocalDateTime parkingTime) {
        this.parkingTime = parkingTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
