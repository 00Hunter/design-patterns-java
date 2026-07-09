package Questions.ParkingLot.V4.ParkingStrategy;

import Questions.ParkingLot.V4.Objects.ParkingFloor;
import Questions.ParkingLot.V4.Objects.SpotAllocation;
import Questions.ParkingLot.V4.Objects.Vehicle;

import java.util.List;

public interface ParkingStrategy {
        SpotAllocation AllocateSpot(List<ParkingFloor>ps, Vehicle vehicle);
}
