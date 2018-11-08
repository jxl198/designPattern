package com.sample.usejava;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 15:58
 **/
//改造观察者
public class MojiWeather implements Observer {
    private WeatherData weatherData;
    @Override
    public void update(Observable o, Object arg) {
       if(arg instanceof  WeatherData){
            this.weatherData =(WeatherData) arg;
            display();
       }
    }
    public void display(){
        System.out.println("moji当前温度："+this.weatherData.getTemperature());
        System.out.println("moji当前湿度："+this.weatherData.getHumidity());
        System.out.println("moji当前气压："+this.weatherData.getPressure());
    }
}
