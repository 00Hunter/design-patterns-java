package Questions.ParkingLot.V4.Objects;

import Questions.ParkingLot.V4.enums.Status;

import java.time.LocalDateTime;

public class ExitGate {
    PricingService pricingService;
    ParkingLotManager psm;
    PaymentService paymentService;


    public ExitGate(PricingService pricingService, ParkingLotManager psm){
        this.pricingService=pricingService;
        this.psm=psm;
    }

    public boolean ProcessPayment(Ticket ticket){
        double priceTopay=pricingService.calculateFee(ticket, LocalDateTime.now());

        paymentService.processPayment()
        psm.RemoveVehicle(ticket.getParkspotId(),ticket.getFloor());
        System.out.println("Your Total is:"+priceTopay);
        GenerateRecipt(priceTopay);
        ticket.setStatus(Status.CLOSED);
        return true;
    }
    void GenerateRecipt(double priceTopay){
        System.out.println("Amount paid"+priceTopay);
    }

}
