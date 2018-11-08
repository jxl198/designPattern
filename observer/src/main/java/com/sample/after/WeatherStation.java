package com.sample.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 15:30
 **/
public class WeatherStation {
    List<Observer> observerList;
    private float temperature;//气温
    private float pressure;//气压
    private float humidity;//湿度
    public WeatherStation() {
        observerList = new ArrayList<Observer>();
    }
    public void setData(float temerature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temerature;
        noticeThirdParty();//通知第三方
    }

    private void noticeThirdParty() {
        if (observerList != null && observerList.size() > 0) {
            for (Observer observer : observerList) {
                observer.update(this.temperature, this.pressure, this.humidity);
            }
        }
    }
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
}
