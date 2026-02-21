import StrategyPattern.Eg2.WithPattern.PaymentService;
import StrategyPattern.Eg2.WithPattern.Strategy.PaymentStrategy;
import StrategyPattern.Eg2.WithPattern.Strategy.UPIStrategy;
import StrategyPattern.WithStrategyPattern.OffRoadVehicle;
import StrategyPattern.WithStrategyPattern.PassengerVehicle;
import StrategyPattern.WithStrategyPattern.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentStrategy strategy=new UPIStrategy();
        PaymentService service=new PaymentService(strategy);
        service.processPayment(2000);
    }
}