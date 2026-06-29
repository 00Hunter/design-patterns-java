import ChainOfResponsiblityPattern.LeaveRequestEg.ConcreteApprover.DirectorApprover;
import ChainOfResponsiblityPattern.LeaveRequestEg.ConcreteApprover.ManagerApprover;
import ChainOfResponsiblityPattern.LeaveRequestEg.ConcreteApprover.TeamLeadApprover;
import ChainOfResponsiblityPattern.LeaveRequestEg.LeaveApprover;
import ChainOfResponsiblityPattern.LeaveRequestEg.LeaveRequest;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import ObserverPattern.WeatherApp.WithObserverPattern.Observable.Observable;
import ObserverPattern.WeatherApp.WithObserverPattern.Observable.WeatherStation;
import ObserverPattern.WeatherApp.WithObserverPattern.Observer.DisplayBoard;
import ObserverPattern.WeatherApp.WithObserverPattern.Observer.MobileApp;
import ObserverPattern.WeatherApp.WithObserverPattern.Observer.Observer;
import Questions.ParkingLot.V1.enums.VehicleType;
import Questions.ParkingLot.V1.objects.EntryGate;
import Questions.ParkingLot.V1.objects.ExitGate;
import Questions.ParkingLot.V1.objects.Ticket;
import Questions.ParkingLot.V1.objects.Vehicles;
import Questions.ParkingLot.V1.objects.ParkingSpotManager;
import Questions.ParkingLot.V1.objects.Vehicles;
import Questions.TicTacToe.Service.GamerRunner;
import StrategyPattern.Eg2.WithPattern.PaymentService;
import StrategyPattern.Eg2.WithPattern.Strategy.CashStrategy;
import StrategyPattern.Eg2.WithPattern.Strategy.UPIStrategy;
import StrategyPattern.WithStrategyPattern.OffRoadVehicle;
import StrategyPattern.WithStrategyPattern.PassengerVehicle;


import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        PaymentStrategy strategy=new UPIStrategy();
//        PaymentService service=new PaymentService(strategy);
//        service.processPayment(2000);
//        Observable WeatherStation=new WeatherStation();
//        Observer ob1=new MobileApp(WeatherStation);
//        Observer ob2=new DisplayBoard(WeatherStation);
//
//        WeatherStation.addObserver(ob1);
//        WeatherStation.addObserver(ob2);
//        WeatherStation.setData(10);
//        GamerRunner gm=new GamerRunner(3);
//        gm.StartGame();


        // Leave Approver
//        LeaveRequest request1=new LeaveRequest(2,"Prajawal");
//        LeaveRequest request2=new LeaveRequest(5,"Honey");
//        LeaveRequest request3=new LeaveRequest(10,"john");
//        LeaveRequest request4=new LeaveRequest(25,"Ron");
//
//        LeaveApprover teamLead=new TeamLeadApprover();
//        LeaveApprover manager=new ManagerApprover();
//        LeaveApprover director=new DirectorApprover();
//
//        teamLead.setNextLeaveApprover(manager);
//        manager.setNextLeaveApprover(director);
//
//        teamLead.Approve(request1);
//        teamLead.Approve(request2);
//        teamLead.Approve(request3);
//        teamLead.Approve(request4);

        //Parking spot

        Vehicles car1 = new Vehicles("KA01AB1234",VehicleType.FOUR_WHEELER);
        ParkingSpotManager parkingSpotManager=new ParkingSpotManager();
        EntryGate entryGate=new EntryGate(parkingSpotManager);
        Ticket ticket=entryGate.GenerateTicket(car1.getVehicleNumber(),VehicleType.FOUR_WHEELER);

        ExitGate exit=new ExitGate(ticket,parkingSpotManager);
;

        if (ticket == null) {
            System.out.println("Parking failed");
            return;
        }


        System.out.println("Vehicle parked");
        System.out.println("Ticket id: " + ticket.getVehicleNumber());
        System.out.println("Vehicle number: " + ticket.getVehicleNumber());
        System.out.println("Spot id: " + ticket.getSpot());
        System.out.println("Vehicle exited successfully");

        exit.RemoveVehicle();
        exit.MakePayment();
        exit.GenerateReceipt();
    }
}