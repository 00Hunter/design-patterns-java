package Questions.ParkingLot.V1;

import Questions.ParkingLot.V1.Enums.VehicleType;
import Questions.ParkingLot.V1.Objects.ParkingSpot;
import Questions.ParkingLot.V1.Objects.Vehicle;
import Questions.ParkingLot.V1.ParkingSpots.FourWheelerSpot;
import Questions.ParkingLot.V1.ParkingSpots.TwoWheelerSpot;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;

 public class ParkingSpotManager {
    List<ParkingSpot>TwoWheelerlist;
    List<ParkingSpot>FourWheelerlist;
    VehicleType vt=VehicleType.FOUR_WHEELER;

    public ParkingSpotManager(){
        this.TwoWheelerlist=new ArrayList<>();
        this.FourWheelerlist=new ArrayList<>();
        CreateList();


    }

     private void CreateList() {
        for(int i=0;i<400;i++){
            TwoWheelerlist.add(new TwoWheelerSpot());
        }

        for(int i=0;i<600;i++){
            FourWheelerlist.add(new FourWheelerSpot());
        }
     }

     public ParkingSpot ParkVehicle(Vehicle v){
        if(v.getType()==VehicleType.FOUR_WHEELER){
            for(int i=0;i<600;i++){
                if(FourWheelerlist.get(i).getStatus()==false){
                    FourWheelerlist.get(i).ParkVehicle(v);
                    return FourWheelerlist.get(i);
                }
            }
        }else{
            for(int i=0;i<400;i++){
                if(TwoWheelerlist.get(i).getStatus()==false){
                    TwoWheelerlist.get(i).ParkVehicle(v);
                    return TwoWheelerlist.get(i);
                }
            }
        }
        return null;
    }
    public void RemoveVehicle(Vehicle v){
        if(v.getType()==VehicleType.TWO_WHEELER){
                for(int i=0;i<400;i++){
                    if(TwoWheelerlist.get(i).getVehicle().getNumber()==v.getNumber()){
                        TwoWheelerlist.get(i).RemoveVehilce();
                    }
                }
        }else {
            for(int i=0;i<600;i++){
                if(FourWheelerlist.get(i).getVehicle()==v){
                    FourWheelerlist.get(i).RemoveVehilce();
                }
            }
        }
    }

    public void AddParkingSpace(ParkingSpot parkingSpot){

    }
    public void RemoveParkingSpace (ParkingSpot parkingSpot){

    }

}

