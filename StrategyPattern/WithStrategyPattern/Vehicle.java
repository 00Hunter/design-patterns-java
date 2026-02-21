package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
 DriveStrategy driveStrategy;
         public Vehicle(DriveStrategy driveStrategy){
                this.driveStrategy=driveStrategy;
         }

         public void drive (){
             this.driveStrategy.drive();
         }
}
