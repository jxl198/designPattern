package com.sample.usejava;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 16:08
 **/
//测试
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData =new WeatherData(10,20,100);
        WeatherStation subject= new WeatherStation();
        MojiWeather mojiWeather = new MojiWeather();
        XiaomiWeather xiaomiWeather = new XiaomiWeather();
        subject.addObserver(mojiWeather);
        subject.addObserver(xiaomiWeather);
        subject.setData(weatherData);
    }
}
