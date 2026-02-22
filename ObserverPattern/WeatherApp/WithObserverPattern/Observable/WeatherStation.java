package ObserverPattern.WeatherApp.WithObserverPattern.Observable;

import ObserverPattern.WeatherApp.WithObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
    List<Observer> list=new ArrayList<>();
    int Temp=12;
    @Override
    public void addObserver(Observer observer) {
            list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:list){
            observer.update();
        }
    }

    @Override
    public void setData(int temp) {
        this.Temp=temp;
        notifyObserver();
    }

    @Override
    public int getData() {
        return this.Temp;
    }
}
