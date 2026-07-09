package Questions.ParkingLot.V4.PricingStrategy;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double CalculatePrice(LocalDateTime parkingtime);
}
