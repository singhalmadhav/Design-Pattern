package Observer_Pattern;

import Observer_Pattern.Observers.CurrentConditionsDisplay;
import Observer_Pattern.Observers.ForecastDisplay;
import Observer_Pattern.Observers.WeatherStatsDisplay;
import Observer_Pattern.data.WeatherData;

public class MainApplication {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        WeatherStatsDisplay weatherStatsDisplay = new WeatherStatsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.f);
        weatherData.setMeasurements(20, 75, 40.f);
        weatherData.setMeasurements(40, 45, 4.f);

    }
}
