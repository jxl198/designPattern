package com.sample.before1;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 11:44
 **/
public class TestApp {

    public static void main(String[] args) {
        Coffee coffee = new Decaf();
        System.out.println(coffee.getCost());
        Coffee espresso = new SugarEspresso();
        System.out.println(espresso.getCost());
    }
}
