package ObserverPattern.WeatherApp.WithObserverPattern.Observable;

import ObserverPattern.WeatherApp.WithObserverPattern.Observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setData(int temp);
    int getData();
}
