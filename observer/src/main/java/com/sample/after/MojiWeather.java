package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 15:33
 **/
public class MojiWeather implements  Observer {
    private float temperature;//气温
    private float pressure;//气压
    private float humidity;//湿度

    public MojiWeather(){
    }
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("moji当前温度："+temperature);
        System.out.println("moji当前湿度："+humidity);
        System.out.println("moji当前气压："+pressure);
    }
}
