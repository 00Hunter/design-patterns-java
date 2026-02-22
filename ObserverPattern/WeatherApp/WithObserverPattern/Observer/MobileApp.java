package ObserverPattern.WeatherApp.WithObserverPattern.Observer;

import ObserverPattern.WeatherApp.WithObserverPattern.Observable.Observable;

public class MobileApp implements Observer{
    Observable observable;

    public MobileApp(Observable observable){
        this.observable=observable;
    }
    @Override
    public void update() {
        System.out.println("this is mobile app and temp is"+observable.getData());

    }
}
