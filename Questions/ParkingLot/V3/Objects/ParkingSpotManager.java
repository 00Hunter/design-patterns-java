package Questions.ParkingLot.V3.Objects;

import Questions.ParkingLot.V3.enums.VehicleTypes;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    List<ParkingFloor>parkingFloors;
    int TotalSpots;

    public ParkingSpotManager(int totalfloors,int two_wheelerspots,int four_wheelerspots,int heavy_spot,int ev_spots){
        parkingFloors=new ArrayList<>();

        for(int i=0;i<totalfloors;i++){
            parkingFloors.add(new ParkingFloor(two_wheelerspots,four_wheelerspots,heavy_spot,ev_spots));
        }
    }

    public int[] FindParkingSpot(Vehicle vehicle){
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
            int [] ans={-1,-1};
            return ans;
        }
        int []ans={parked,floor};
        return ans;
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

    public void RemoveVehicle(int spot){
            }
}
