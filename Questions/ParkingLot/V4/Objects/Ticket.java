package Questions.ParkingLot.V4.Objects;

import Questions.ParkingLot.V4.enums.Status;

import java.time.LocalDateTime;

public class Ticket {
    int id;
    int floor;
    int parkspotId;
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

    public int getParkspotId() {
        return parkspotId;
    }

    public void setParkspotId(int parkspotId) {
        this.parkspotId = parkspotId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
