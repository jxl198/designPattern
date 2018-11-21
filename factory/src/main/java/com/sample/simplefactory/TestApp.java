package com.sample.simplefactory;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 10:05
 **/
public class TestApp {
    public static void main(String[] args) {
        RestaurantClient client = new RestaurantClient();
        client.productPizza("cheese");

    }
}
