package Questions.ParkingLot.V2.Objects;

import Questions.ParkingLot.V2.enums.VehicleTypes;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> list;
    int TotalSpots;

    public ParkingSpotManager(int two_wheelerspots,int four_wheelerspots,int heavy_spot,int ev_spots){
        int starting=0;
        for(int i=0;i<two_wheelerspots;i++){
            list.add(new ParkingSpot(i,VehicleTypes.TWO_WHEELER));
        }
        starting=two_wheelerspots;
        for(int i=starting;i<starting+four_wheelerspots;i++){
            list.add(new ParkingSpot(i,VehicleTypes.FOUR_WHEELER));
        }
        starting=starting+four_wheelerspots;
        for(int i=starting;i<starting+heavy_spot;i++){
            list.add(new ParkingSpot(i,VehicleTypes.HEAVY_VEHICLE));
        }
        starting=starting+heavy_spot;

        for(int i=starting;i<starting+ev_spots;i++){
            list.add(new ParkingSpot(i,VehicleTypes.EV_FOUR_WHEELER));
        }

        this.TotalSpots=starting+ev_spots;
    }

    public int FindParkingSpot(Vehicle vehicle){
        for(int i=0;i<TotalSpots;i++){
            ParkingSpot ps=list.get(i);
            boolean canPark=ps.CanPark(vehicle);
            if(canPark){
                ps.ParkVehicle(vehicle);
                return i;
            }
        }
        return -1;
    }

    public boolean AddParkingSpot(VehicleTypes types,int count){
        for(int i=this.TotalSpots;i<count+this.TotalSpots;i++){
            list.add(new ParkingSpot(i,types));
        }
        this.TotalSpots=this.TotalSpots+count;
        return true;
    }

    public boolean RemoveParkingSpot(){
        System.out.println("Parking SPot removed");
        return true;
    }

    public void RemoveVehicle(int spot){
        this.list.get(spot).RemoveVehicle();
    }
}
