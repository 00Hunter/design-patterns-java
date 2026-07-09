package Questions.ParkingLot.V4.ParkingStrategy.Implementation;

import Questions.ParkingLot.V4.Objects.ParkingFloor;
import Questions.ParkingLot.V4.Objects.SpotAllocation;
import Questions.ParkingLot.V4.Objects.Vehicle;
import Questions.ParkingLot.V4.ParkingStrategy.ParkingStrategy;

import java.util.List;

public class SomeOtherStrategy implements ParkingStrategy {
    @Override
    public SpotAllocation AllocateSpot(List<ParkingFloor>parkingFloors, Vehicle vehicle){
        int parked=-1;
        int floor=-1;

        for(int i=0;i<parkingFloors.size();i++){
            ParkingFloor pf=parkingFloors.get(i);
            parked=pf.findParkingSpot(vehicle);
            floor=i;
            if(parked!=-1){
                break;
            }
        }

        if(parked==-1){
            return null;
        }

        SpotAllocation newSpot=new SpotAllocation(floor,parked);
        return newSpot;
    }
}
