package Questions.ParkingLot.V3.PricingStrategy;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double CalculatePrice(LocalDateTime parkingtime);
}
