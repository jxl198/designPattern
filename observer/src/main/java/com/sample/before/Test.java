package com.sample.before;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 14:53
 **/
public class Test {

    public static void main(String[] args) {
        MojiWeather mojiWeather= new MojiWeather();
        XiaomiWeather xiaomiWeather = new XiaomiWeather();
        WeatherStation station= new WeatherStation(mojiWeather ,xiaomiWeather);
        station.setData(10,130,30);

    }
}
