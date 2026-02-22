package ObserverPattern.WeatherApp.WithObserverPattern.Observer;

import ObserverPattern.WeatherApp.WithObserverPattern.Observable.Observable;

public class DisplayBoard implements Observer{
    Observable observable;

   public DisplayBoard(Observable observable){
        this.observable=observable;
    }

    @Override
    public void update() {
        System.out.print("This is Display board and temp is"+observable.getData());
    }
}
