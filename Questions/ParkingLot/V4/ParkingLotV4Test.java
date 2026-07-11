package Questions.ParkingLot.V4;

import Questions.ParkingLot.V4.Objects.*;
import Questions.ParkingLot.V4.ParkingStrategy.Implementation.SomeOtherStrategy;
import Questions.ParkingLot.V4.enums.VehicleTypes;
import Questions.ParkingLot.V4.enums.Status;

public class ParkingLotV4Test {

    public static void main(String[] args) {

        /*
         * Setup:
         * 2 floors
         * each floor:
         * 1 two-wheeler spot
         * 1 four-wheeler spot
         * 1 heavy vehicle spot
         * 1 EV spot
         */
        ParkingLotManager parkingLotManager = new ParkingLotManager(
                new SomeOtherStrategy(),
                2,
                1,
                1,
                1,
                1
        );

        PricingService pricingService = new PricingService();
        PaymentService paymentService = new PaymentService();

        EntryGate entryGate = new EntryGate(parkingLotManager);
        ExitGate exitGate = new ExitGate(
                pricingService,
                parkingLotManager
        );

        System.out.println("===== TEST 1: Park four wheeler =====");

        Vehicle car1 = new Vehicle("KA01AB1234", VehicleTypes.FOUR_WHEELER);
        Ticket carTicket1 = entryGate.GenerateTicket(car1);

        if (carTicket1 == null) {
            System.out.println("FAILED: Car ticket should not be null");
        } else {
            System.out.println("PASSED: Car parked");
            System.out.println("Floor: " + carTicket1.getFloor());
            System.out.println("Spot: " + carTicket1.getParkspotId());
            System.out.println("Vehicle: " + carTicket1.getVehicle().getNumber());
            System.out.println("Status: " + carTicket1.getStatus());
        }

        System.out.println("\n===== TEST 2: Successful CASH payment exit =====");

        if (carTicket1 != null) {
            boolean exited = exitGate.ProcessPayment("CASH", carTicket1);

            if (exited && carTicket1.getStatus() == Status.CLOSED) {
                System.out.println("PASSED: Car exited after successful payment");
            } else {
                System.out.println("FAILED: Car should exit and ticket should be closed");
            }
        }

        System.out.println("\n===== TEST 3: Reuse freed spot after successful exit =====");

        Vehicle car2 = new Vehicle("KA02CD5678", VehicleTypes.FOUR_WHEELER);
        Ticket carTicket2 = entryGate.GenerateTicket(car2);

        if (carTicket2 == null) {
            System.out.println("FAILED: Second car should get freed spot");
        } else {
            System.out.println("PASSED: Second car parked after first car exited");
            System.out.println("Floor: " + carTicket2.getFloor());
            System.out.println("Spot: " + carTicket2.getParkspotId());
            System.out.println("Vehicle: " + carTicket2.getVehicle().getNumber());
        }

        System.out.println("\n===== TEST 4: Invalid payment mode should fail =====");

        Vehicle car3 = new Vehicle("KA03EF9999", VehicleTypes.FOUR_WHEELER);
        Ticket carTicket3 = entryGate.GenerateTicket(car3);

        if (carTicket3 == null) {
            System.out.println("Setup issue: Could not park car3");
        } else {
            boolean exited = exitGate.ProcessPayment("BITCOIN", carTicket3);

            if (!exited && carTicket3.getStatus() == Status.ACTIVE) {
                System.out.println("PASSED: Invalid payment failed and ticket stayed ACTIVE");
            } else {
                System.out.println("FAILED: Invalid payment should not close ticket or free spot");
            }
        }

        System.out.println("\n===== TEST 5: No four-wheeler spot left after failed payment =====");

        Vehicle car4 = new Vehicle("KA04GH1111", VehicleTypes.FOUR_WHEELER);
        Ticket carTicket4 = entryGate.GenerateTicket(car4);

        if (carTicket4 == null) {
            System.out.println("PASSED: Spot was not freed after failed payment");
        } else {
            System.out.println("FAILED: Spot should not have been available after failed payment");
            System.out.println("Floor: " + carTicket4.getFloor());
            System.out.println("Spot: " + carTicket4.getParkspotId());
        }

        System.out.println("\n===== TEST 6: Pay again with valid mode after failed payment =====");

        if (carTicket3 != null) {
            boolean exited = exitGate.ProcessPayment("UPI", carTicket3);

            if (exited && carTicket3.getStatus() == Status.CLOSED) {
                System.out.println("PASSED: Same active ticket exited after successful payment");
            } else {
                System.out.println("FAILED: Active ticket should exit after valid payment");
            }
        }

        System.out.println("\n===== TEST 7: Same closed ticket should not exit twice =====");

        if (carTicket3 != null) {
            try {
                boolean exitedAgain = exitGate.ProcessPayment("CASH", carTicket3);

                if (!exitedAgain) {
                    System.out.println("PASSED: Closed ticket did not exit again");
                } else {
                    System.out.println("FAILED: Closed ticket should not exit again");
                }

            } catch (Exception e) {
                System.out.println("PASSED: Closed ticket exit failed with exception: " + e.getMessage());
            }
        }

        System.out.println("\n===== TEST 8: Bike parking and payment =====");

        Vehicle bike = new Vehicle("KA05BIKE1", VehicleTypes.TWO_WHEELER);
        Ticket bikeTicket = entryGate.GenerateTicket(bike);

        if (bikeTicket == null) {
            System.out.println("FAILED: Bike should get two-wheeler spot");
        } else {
            System.out.println("PASSED: Bike parked");
            System.out.println("Floor: " + bikeTicket.getFloor());
            System.out.println("Spot: " + bikeTicket.getParkspotId());

            boolean bikeExited = exitGate.ProcessPayment("CARD", bikeTicket);

            if (bikeExited && bikeTicket.getStatus() == Status.CLOSED) {
                System.out.println("PASSED: Bike exited after payment");
            } else {
                System.out.println("FAILED: Bike should exit after payment");
            }
        }

        System.out.println("\n===== TEST 9: Heavy vehicle parking =====");

        Vehicle truck = new Vehicle("KA99TRUCK1", VehicleTypes.HEAVY_VEHICLE);
        Ticket truckTicket = entryGate.GenerateTicket(truck);

        if (truckTicket == null) {
            System.out.println("FAILED: Heavy vehicle should get heavy vehicle spot");
        } else {
            System.out.println("PASSED: Heavy vehicle parked");
            System.out.println("Floor: " + truckTicket.getFloor());
            System.out.println("Spot: " + truckTicket.getParkspotId());
            System.out.println("Vehicle: " + truckTicket.getVehicle().getNumber());
        }

        System.out.println("\n===== V4 TESTS COMPLETED =====");
    }
}