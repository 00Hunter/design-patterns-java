package Questions.ParkingLot.V5.ParkingStrategy;

import Questions.ParkingLot.V5.Objects.ParkingFloor;
import Questions.ParkingLot.V5.Objects.SpotAllocation;
import Questions.ParkingLot.V5.Objects.Vehicle;

import java.util.List;

public interface ParkingStrategy {
        SpotAllocation AllocateSpot(List<ParkingFloor>ps, Vehicle vehicle);
}
