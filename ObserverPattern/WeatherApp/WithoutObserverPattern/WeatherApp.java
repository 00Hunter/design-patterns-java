package ObserverPattern.WeatherApp.WithoutObserverPattern;

class MobileApp {
    void updateTemperature(float t) {
        System.out.println("MobileApp: " + t);
    }
}

class DisplayBoard {
    void showTemperature(float t) {
        System.out.println("DisplayBoard: " + t);
    }
}

class AnalyticsService {
    void recordTemperature(float t) {
        System.out.println("Analytics recorded: " + t);
    }
}

public class WeatherApp {
    private float temperature;

    // Hard dependencies ❌
    private final MobileApp mobileApp;
    private final DisplayBoard displayBoard;
    private final AnalyticsService analyticsService;

    public WeatherApp(MobileApp mobileApp,
                          DisplayBoard displayBoard,
                          AnalyticsService analyticsService) {
        this.mobileApp = mobileApp;
        this.displayBoard = displayBoard;
        this.analyticsService = analyticsService;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;

        // Manual notifications (WeatherStation must know everyone) ❌
        mobileApp.updateTemperature(temperature);
        displayBoard.showTemperature(temperature);
        analyticsService.recordTemperature(temperature);
    }
}

