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
        this.paymentService=new PaymentService();
    }

    public boolean ProcessPayment(String mode,Ticket ticket){
        double priceTopay=pricingService.calculateFee(ticket, LocalDateTime.now());


        System.out.println("Your Total is:"+priceTopay);
       boolean isPaymentDone= paymentService.processPayment(mode,priceTopay);

       if(isPaymentDone){
           psm.RemoveVehicle(ticket.getFloor(), ticket.getParkspotId());
           GenerateRecipt(priceTopay);
           ticket.setStatus(Status.CLOSED);
           return true;
       }

       return false;

    }
    void GenerateRecipt(double priceTopay){
        System.out.println("Amount paid"+priceTopay);
    }

}
