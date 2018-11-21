package com.sample.abstractfactory;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:22
 **/
public class TestApp {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        RestaurantClient client = new RestaurantClient();
        client.createPizza(BaconFactory.class);
    }
}
