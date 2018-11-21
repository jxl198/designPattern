package com.sample.factorymethod;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:10
 **/
public class TestApp {

    public static void main(String[] args) {
        RestaurantClient client = new RestaurantClient();
        client.createPizza("bacon");
    }
}
