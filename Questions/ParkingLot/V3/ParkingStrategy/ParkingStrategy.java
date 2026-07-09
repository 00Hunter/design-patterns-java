package Questions.ParkingLot.V3.ParkingStrategy;

import Questions.ParkingLot.V3.Objects.ParkingFloor;
import Questions.ParkingLot.V3.Objects.SpotAllocation;
import Questions.ParkingLot.V3.Objects.Vehicle;

import java.util.List;

public interface ParkingStrategy {
        SpotAllocation AllocateSpot(List<ParkingFloor>ps, Vehicle vehicle);
}
