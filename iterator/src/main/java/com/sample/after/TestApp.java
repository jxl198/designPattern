package com.sample.after;


import com.sample.entity.MenuItem;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-30 11:41
 **/
public class TestApp {
    public static void main(String[] args) {
        CakeHouse house = new CakeHouse();
        initHouse(house);
        DinnerRestaurant restaurant = new DinnerRestaurant();
        initDinnerRestaurant(restaurant);
        Waiter waiter = new Waiter();
        waiter.addContainer(house);
        waiter.addContainer(restaurant);
        waiter.printMenu();
    }

    private static void initDinnerRestaurant(DinnerRestaurant restaurant) {
        restaurant.addItem(new MenuItem("chicken", "chicken", 40.1f));
        restaurant.addItem(new MenuItem("fish", "fish", 20.1f));
        restaurant.addItem(new MenuItem("noodle", "noodle", 11.2f));
        restaurant.addItem(new MenuItem("rice", "rice", 2.0f));

    }

    private static void initHouse(CakeHouse house) {
        house.addItem(new MenuItem("CreamCake", "cream cake", 110.2f));
        house.addItem(new MenuItem("FruitCake", "fruit cake", 130.2f));
        house.addItem(new MenuItem("Chocolate", "chocolate cake", 150.2f));

    }
}
