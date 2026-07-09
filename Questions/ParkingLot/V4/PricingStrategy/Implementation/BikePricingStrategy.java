package Questions.ParkingLot.V4.PricingStrategy.Implementation;

import Questions.ParkingLot.V4.PricingStrategy.PricingStrategy;

import java.time.Duration;
import java.time.LocalDateTime;

public class BikePricingStrategy implements PricingStrategy {
    @Override
    public double CalculatePrice(LocalDateTime parkingTime) {
        LocalDateTime entryTime = parkingTime;
        LocalDateTime exitTime = LocalDateTime.now();

        Duration duration = Duration.between(entryTime, exitTime);
        long chargedHours = Math.max(1, (duration.toMinutes() + 59) / 60);
        double fee = chargedHours * 10.0;

        return fee;
    }
}
