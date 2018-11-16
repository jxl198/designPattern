package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 17:47
 **/
public class TestApp {
    public static void main(String[] args) {
        //单品
        Coffee americano = new Americano();
        System.out.println("americano:"+americano.getCost());
        System.out.println("americano:"+americano.getDescription());
        //加入糖
        americano = new SugarDecorator(americano);
        System.out.println("sugar americano:"+americano.getCost());
        System.out.println("sugar americano:"+americano.getDescription());
        //再加入牛奶
        americano = new MilkDecorator(americano);
        System.out.println("sugar milk americano:"+americano.getCost());
        System.out.println("sugar milk  americano:"+americano.getDescription());
    }
}
