package Questions.ParkingLot.V5.Objects;

import Questions.ParkingLot.V5.enums.VehicleTypes;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    int id;
    List<ParkingSpot>spots;
    int totalSpots;


    public ParkingFloor(int two_wheelerspots,int fourWheelerSpots,int heavy_vehiclespot,int ev_spots){

        this.spots=new ArrayList<>();

        this.totalSpots=two_wheelerspots+fourWheelerSpots+heavy_vehiclespot+ev_spots;

        int spotstillnow=two_wheelerspots;
        for(int i=0;i<two_wheelerspots;i++){
            spots.add(new ParkingSpot(i, VehicleTypes.TWO_WHEELER));
        }


        for(int i=0;i<fourWheelerSpots;i++){
            spots.add(new ParkingSpot(i+spotstillnow, VehicleTypes.FOUR_WHEELER));
        }
        spotstillnow+=fourWheelerSpots;

        for(int i=0;i<heavy_vehiclespot;i++){
            spots.add(new ParkingSpot(i+spotstillnow, VehicleTypes.HEAVY_VEHICLE));
        }
        spotstillnow+=heavy_vehiclespot;

        for(int i=0;i<ev_spots;i++){
            spots.add(new ParkingSpot(i+spotstillnow, VehicleTypes.EV_FOUR_WHEELER));
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public int findParkingSpot(Vehicle v){
        for(int i=0;i<totalSpots;i++){
            ParkingSpot ps=spots.get(i);

            if(ps.CanPark(v)){
                return i;
            }
        }
        return -1;
    }



    public boolean addParkingspots(VehicleTypes vehicleTypes, int parkingspotCount){
            for(int i=0;i<parkingspotCount;i++){
                spots.add(new ParkingSpot(i+totalSpots,vehicleTypes));
            }
            this.totalSpots+=parkingspotCount;
            return true;
    }
}
