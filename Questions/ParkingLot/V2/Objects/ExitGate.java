package Questions.ParkingLot.V2.Objects;

import Questions.ParkingLot.V2.PricingStrategy.PricingStrategy;

import java.time.LocalDateTime;

public class ExitGate {
    PricingService pricingService;
    ParkingSpotManager psm;

    public ExitGate(PricingService pricingService,ParkingSpotManager psm){
        this.pricingService=pricingService;
        this.psm=psm;
    }

    boolean ProcessPayment(Ticket ticket){
        double priceTopay=pricingService.calculateFee(ticket, LocalDateTime.now());
        psm.RemoveVehicle(ticket.id);
        System.out.println("Your Total is:"+priceTopay);
        GenerateRecipt(priceTopay);
        return true;
    }
    void GenerateRecipt(double priceTopay){
        System.out.println("Amount paid"+priceTopay);
    }

}
