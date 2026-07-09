package Questions.ParkingLot.V3;

import Questions.ParkingLot.V3.Objects.*;
import Questions.ParkingLot.V3.ParkingStrategy.Implementation.SomeOtherStrategy;
import Questions.ParkingLot.V3.enums.VehicleTypes;

public class ParkingLotV3Test {

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

        EntryGate entryGate = new EntryGate(parkingLotManager);
        ExitGate exitGate = new ExitGate(pricingService, parkingLotManager);

        System.out.println("===== TEST 1: Park four wheeler =====");

        Vehicle car1 = new Vehicle("KA01AB1234", VehicleTypes.FOUR_WHEELER);

        Ticket carTicket = entryGate.GenerateTicket(car1);

        if (carTicket == null) {
            System.out.println("FAILED: Car ticket should not be null");
        } else {
            System.out.println("PASSED: Car parked");
            System.out.println("Floor: " + carTicket.getFloor());
            System.out.println("Spot: " + carTicket.getParkspotId());
            System.out.println("Vehicle: " + carTicket.getVehicle().getNumber());
        }

        System.out.println("\n===== TEST 2: Park second four wheeler =====");

        Vehicle car2 = new Vehicle("KA02CD5678", VehicleTypes.FOUR_WHEELER);

        Ticket carTicket2 = entryGate.GenerateTicket(car2);

        if (carTicket2 == null) {
            System.out.println("FAILED: Second car should get spot on second floor");
        } else {
            System.out.println("PASSED: Second car parked");
            System.out.println("Floor: " + carTicket2.getFloor());
            System.out.println("Spot: " + carTicket2.getParkspotId());
            System.out.println("Vehicle: " + carTicket2.getVehicle().getNumber());
        }

        System.out.println("\n===== TEST 3: Park third four wheeler, should fail =====");

        Vehicle car3 = new Vehicle("KA03EF9999", VehicleTypes.FOUR_WHEELER);

        Ticket carTicket3 = entryGate.GenerateTicket(car3);

        if (carTicket3 == null) {
            System.out.println("PASSED: Third car could not be parked because no four-wheeler spot left");
        } else {
            System.out.println("FAILED: Third car should not have received a ticket");
            System.out.println("Floor: " + carTicket3.getFloor());
            System.out.println("Spot: " + carTicket3.getParkspotId());
        }

        System.out.println("\n===== TEST 4: Exit first car =====");

        if (carTicket != null) {
            boolean exited = exitGate.ProcessPayment(carTicket);

            if (exited) {
                System.out.println("PASSED: First car exited");
            } else {
                System.out.println("FAILED: First car exit failed");
            }
        }

        System.out.println("\n===== TEST 5: Park third car again after first car exits =====");

        Ticket carTicket4 = entryGate.GenerateTicket(car3);

        if (carTicket4 == null) {
            System.out.println("FAILED: Third car should now get freed spot");
        } else {
            System.out.println("PASSED: Third car parked after spot was freed");
            System.out.println("Floor: " + carTicket4.getFloor());
            System.out.println("Spot: " + carTicket4.getParkspotId());
            System.out.println("Vehicle: " + carTicket4.getVehicle().getNumber());
        }

        System.out.println("\n===== TEST 6: Park two wheeler =====");

        Vehicle bike = new Vehicle("KA05BIKE1", VehicleTypes.TWO_WHEELER);

        Ticket bikeTicket = entryGate.GenerateTicket(bike);

        if (bikeTicket == null) {
            System.out.println("FAILED: Bike should get two-wheeler spot");
        } else {
            System.out.println("PASSED: Bike parked");
            System.out.println("Floor: " + bikeTicket.getFloor());
            System.out.println("Spot: " + bikeTicket.getParkspotId());
            System.out.println("Vehicle: " + bikeTicket.getVehicle().getNumber());
        }

        System.out.println("\n===== TEST 7: Vehicle type compatibility =====");

        Vehicle heavyVehicle = new Vehicle("KA99TRUCK1", VehicleTypes.HEAVY_VEHICLE);

        Ticket heavyTicket = entryGate.GenerateTicket(heavyVehicle);

        if (heavyTicket == null) {
            System.out.println("FAILED: Heavy vehicle should get heavy vehicle spot");
        } else {
            System.out.println("PASSED: Heavy vehicle parked");
            System.out.println("Floor: " + heavyTicket.getFloor());
            System.out.println("Spot: " + heavyTicket.getParkspotId());
            System.out.println("Vehicle: " + heavyTicket.getVehicle().getNumber());
        }
    }
}