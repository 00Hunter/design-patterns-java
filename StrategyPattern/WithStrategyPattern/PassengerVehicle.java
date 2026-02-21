package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
   public  PassengerVehicle(){
        super((new NormalDriveStrategy()));
    }
}
