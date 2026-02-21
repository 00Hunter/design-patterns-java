package StrategyPattern.WithStrategyPattern;


import StrategyPattern.WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
   public OffRoadVehicle(){
        super((new SpecialDriveStrategy()));
    }
}
