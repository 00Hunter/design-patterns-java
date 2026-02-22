import ObserverPattern.WeatherApp.WithObserverPattern.Observable.Observable;
import ObserverPattern.WeatherApp.WithObserverPattern.Observable.WeatherStation;
import ObserverPattern.WeatherApp.WithObserverPattern.Observer.DisplayBoard;
import ObserverPattern.WeatherApp.WithObserverPattern.Observer.MobileApp;
import ObserverPattern.WeatherApp.WithObserverPattern.Observer.Observer;
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

//        PaymentStrategy strategy=new UPIStrategy();
//        PaymentService service=new PaymentService(strategy);
//        service.processPayment(2000);
        Observable WeatherStation=new WeatherStation();
        Observer ob1=new MobileApp(WeatherStation);
        Observer ob2=new DisplayBoard(WeatherStation);

        WeatherStation.addObserver(ob1);
        WeatherStation.addObserver(ob2);
        WeatherStation.setData(10);

    }
}