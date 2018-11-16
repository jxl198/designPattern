package com.sample.before2;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 11:58
 **/
public class TestApp {

    public static void main(String[] args) {
        Coffee coffee = new Americano();
        coffee.setMilk(true);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
        coffee.setSugar(true);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
