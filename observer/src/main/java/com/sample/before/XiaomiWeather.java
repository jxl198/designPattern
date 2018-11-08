package com.sample.before;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 14:34
 **/
public class XiaomiWeather {
    private float temperature;//气温
    private float pressure;//气压
    private float humidity;//湿度

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("xiaomi当前温度：" + temperature);
        System.out.println("xiaomi当前湿度：" + humidity);
        System.out.println("xiaomi当前气压：" + pressure);
    }

}
