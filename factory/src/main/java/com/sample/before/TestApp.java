package com.sample.before;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-20 18:20
 **/
public class TestApp {

    public static void main(String[] args) {
        RestaurantClient client = new RestaurantClient();
        client.createPizza("cheese");
    }
}
