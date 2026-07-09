package Questions.ParkingLot.V4.Objects;

import Questions.ParkingLot.V4.PricingStrategy.Implementation.BikePricingStrategy;
import Questions.ParkingLot.V4.PricingStrategy.Implementation.EV_Four_Wheeler;
import Questions.ParkingLot.V4.PricingStrategy.Implementation.FourWheelerPricingStrategy;
import Questions.ParkingLot.V4.PricingStrategy.Implementation.Heavy_Vehicle;
import Questions.ParkingLot.V4.PricingStrategy.PricingStrategy;
import Questions.ParkingLot.V4.enums.VehicleTypes;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PricingService {
    private final Map<VehicleTypes, PricingStrategy> strategies = new HashMap<>();

    public PricingService() {
        strategies.put(
                VehicleTypes.TWO_WHEELER,
                new BikePricingStrategy()
        );

        strategies.put(
                VehicleTypes.FOUR_WHEELER,
                new FourWheelerPricingStrategy()
        );

        strategies.put(
                VehicleTypes.EV_FOUR_WHEELER,
                new EV_Four_Wheeler()
        );

        strategies.put(
                VehicleTypes.HEAVY_VEHICLE,
                new Heavy_Vehicle()
        );
    }
    public double calculateFee(Ticket ticket, LocalDateTime exitTime) {
        VehicleTypes type = ticket.getVehicle().getVehicleTypes();

        PricingStrategy strategy = strategies.get(type);

        if (strategy == null) {
            throw new IllegalStateException("No pricing strategy found");
        }

        return strategy.CalculatePrice(exitTime);
    }
}
