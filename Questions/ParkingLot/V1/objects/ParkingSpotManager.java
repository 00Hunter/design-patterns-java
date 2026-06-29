package Questions.ParkingLot.V1.objects;

import Questions.ParkingLot.V1.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot>list=new ArrayList<>();

   public ParkingSpotManager(){
        for(int i=0;i<=200;i++){
            list.add(new ParkingSpot(VehicleType.TWO_WHEELER));
        }
        for(int i=201;i<=600;i++){
            list.add(new ParkingSpot(VehicleType.FOUR_WHEELER));
        }
    }
    void AddParkingSpots(VehicleType type){
        this.list.add(new ParkingSpot(type));
    }
    void RemoveParkingSpot(int index){
        this.list.remove(index);
    }

    int findParkingSpot(VehicleType type){
      if(type==VehicleType.TWO_WHEELER){
          for(int i=0;i<=200;i++){
              if(list.get(i).isParkingSpotEmpty()){
                list.get(i).ParkVehcile();
                return i;
              }
          }
      }

        for(int i=201;i<=600;i++){
            if(list.get(i).isParkingSpotEmpty()){
                list.get(i).ParkVehcile();
                return i;
            }
        }

        return -1;

    }
}
