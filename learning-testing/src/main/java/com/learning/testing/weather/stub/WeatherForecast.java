package com.learning.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double getAverage() {
        double sum = 0;

        for (Map.Entry<String, Double> getTemperature : temperatures.getTemperatures().entrySet()) {
            sum += getTemperature.getValue();
        }
        sum = sum / temperatures.getTemperatures().size();
        return Math.round(sum * 100.0) / 100.0;

    }

    public double getMedianTemperature() {
        double median;

        List<Double> arrayList = new ArrayList<>();
        for (Map.Entry<String, Double> getTemperature : temperatures.getTemperatures().entrySet()) {
            arrayList.add(getTemperature.getValue());
        }
        Collections.sort(arrayList);

        if (arrayList.size() % 2 == 0) {
            median = (arrayList.get((arrayList.size() / 2) - 1) + arrayList.get(arrayList.size() / 2)) / 2;
        } else {
            median = arrayList.get((arrayList.size() + 1) / 2 - 1);
        }
        return median;

    }

}