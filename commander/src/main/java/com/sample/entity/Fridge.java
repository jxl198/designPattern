package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:24
 **/
public class Fridge {
    private int temperature=10;

    public void on() {
        System.out.println("fridge is on ");
    }

    public void off() {
        System.out.println("fridge is  off");
    }

    public void temperatureUp() {
        this.temperature++;
        System.out.println(" up temperature：" + temperature + " is set");
    }

    public void temperatureDown() {
        this.temperature--;
        System.out.println(" down temperature：" + temperature + " is set");
    }
}
