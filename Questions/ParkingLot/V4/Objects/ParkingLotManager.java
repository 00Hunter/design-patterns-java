package Questions.ParkingLot.V4.Objects;

import Questions.ParkingLot.V4.ParkingStrategy.ParkingStrategy;
import Questions.ParkingLot.V4.enums.VehicleTypes;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {
    List<ParkingFloor>parkingFloors;
    ParkingStrategy parkingStrategy;
    int TotalSpots;

    public ParkingLotManager(ParkingStrategy ps,int totalfloors, int two_wheelerspots, int four_wheelerspots, int heavy_spot, int ev_spots){
        parkingFloors=new ArrayList<>();
        this.parkingStrategy=ps;

        for(int i=0;i<totalfloors;i++){
            parkingFloors.add(new ParkingFloor(two_wheelerspots,four_wheelerspots,heavy_spot,ev_spots));
        }
    }

    public SpotAllocation FindParkingSpot(Vehicle vehicle){
        SpotAllocation newspot=parkingStrategy.AllocateSpot(parkingFloors,vehicle);
        return newspot;
    }

    public ParkingSpot getParkingSpot(int floor, int spotId){
        ParkingFloor pf=parkingFloors.get(floor);
        return pf.getSpots().get(spotId);
    }

    public boolean AddParkingSpot(int floor,VehicleTypes types,int count){
        ParkingFloor pf=parkingFloors.get(floor);
        pf.addParkingspots(types,count);
        return true;
    }

    public boolean RemoveParkingSpot(){
        System.out.println("Parking SPot removed");
        return true;
    }

    public void RemoveVehicle(int spotid,int floor){}
}
