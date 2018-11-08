package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 15:38
 **/
public class XiaomiWeather implements Observer {

    private float temperature;//气温
    private float pressure;//气压
    private float humidity;//湿度
    public XiaomiWeather() {
    }
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    public void display() {
        System.out.println("xiaomi当前温度：" + temperature);
        System.out.println("xiaomi当前湿度：" + humidity);
        System.out.println("xiaomi当前气压：" + pressure);

    }
}
