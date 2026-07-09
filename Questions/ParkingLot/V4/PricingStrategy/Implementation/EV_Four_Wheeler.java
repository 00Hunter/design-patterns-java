package Questions.ParkingLot.V4.PricingStrategy.Implementation;

import Questions.ParkingLot.V4.PricingStrategy.PricingStrategy;

import java.time.Duration;
import java.time.LocalDateTime;

public class EV_Four_Wheeler implements PricingStrategy {
    @Override
    public double CalculatePrice(LocalDateTime parkingtime) {
        LocalDateTime entryTime = parkingtime;
        LocalDateTime exitTime = LocalDateTime.now();

        Duration duration = Duration.between(entryTime, exitTime);
        long chargedHours = Math.max(1, (duration.toMinutes() + 59) / 60);
        double fee = chargedHours * 30.0;
        return fee;
    }
}
