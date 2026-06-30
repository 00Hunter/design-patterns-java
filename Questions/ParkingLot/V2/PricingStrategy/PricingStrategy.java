package Questions.ParkingLot.V2.PricingStrategy;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double CalculatePrice(LocalDateTime parkingtime);
}
