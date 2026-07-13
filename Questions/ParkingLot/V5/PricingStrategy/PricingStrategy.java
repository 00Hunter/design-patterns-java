package Questions.ParkingLot.V5.PricingStrategy;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double CalculatePrice(LocalDateTime parkingtime);
}
