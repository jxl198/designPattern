package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 15:39
 **/
public class Test {

    public static void main(String[] args) {
        WeatherStation subject =new WeatherStation();
        subject.setData(12,100,20);
        MojiWeather mojiWeather = new MojiWeather();
        subject.registerObserver(mojiWeather);
        XiaomiWeather xiaomiWeather =new XiaomiWeather();
        subject.registerObserver(xiaomiWeather);
        subject.setData(11,200,44);
    }
}
