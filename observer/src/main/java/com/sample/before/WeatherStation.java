package com.sample.before;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-08 14:26
 **/
public class WeatherStation {
    private float temperature;//气温
    private float pressure;//气压
    private float humidity;//湿度
    private  MojiWeather mojiWeather;
    private  XiaomiWeather xiaomiWeather;
    public WeatherStation(MojiWeather mojiWeatherm, XiaomiWeather xiaomiWeather) {
        this.mojiWeather = mojiWeatherm;
        this.xiaomiWeather = xiaomiWeather;
    }
    public void setData(float temerature, float pressure, float humidity) {
        this.humidity=humidity;
        this.pressure=pressure;
        this.temperature=temerature;
        noticeThirdParty();//通知第三方
    }
    private void noticeThirdParty() {
        mojiWeather.update(this.temperature,this.pressure,this.humidity);
        xiaomiWeather.update(this.temperature,this.pressure,this.humidity);
    }

}
