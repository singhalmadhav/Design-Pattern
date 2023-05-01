package Observer_Pattern.Observers;

import Observer_Pattern.data.WeatherData;
import Observer_Pattern.interfaces.Observer;
import Observer_Pattern.interfaces.display;

public class CurrentConditionsDisplay implements Observer, display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        temperature = weatherData.getTemperature();
        pressure = weatherData.getPressure();
        humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Current Conditions Display Measurements are: \n" +
                "Temperature - " + temperature + "\n" + "Pressure - " + pressure + "Humidity - " + humidity);
    }
}
