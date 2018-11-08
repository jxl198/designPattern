package com.sample.usejava;

import java.util.Observable;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 15:55
 **/
//改造被观察者
public class WeatherStation extends Observable {

    private WeatherData weatherData;

    public WeatherStation( ) {
        super();
    }
    public void setData(WeatherData weatherData ){
        this.weatherData = weatherData;
        this.setChanged();  //标识数据变化，否则不会通知
        super.notifyObservers(weatherData);
    }
}
