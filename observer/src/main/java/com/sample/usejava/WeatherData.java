package com.sample.usejava;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 15:54
 **/
//定义个天气对象
public class WeatherData {
    private float temperature;//气温
    private float pressure;//气压
    private float humidity;//湿度

    public WeatherData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.humidity=humidity;
        this.pressure=pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
