package com.sample.java;

import com.sample.entity.MenuItem;

import java.util.Iterator;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-30 11:36
 **/
public class Waiter {
    private CakeHouse cakeHouse;
    private DinnerRestaurant restaurant;

    public Waiter(CakeHouse cakeHouse, DinnerRestaurant restaurant) {
        this.cakeHouse = cakeHouse;
        this.restaurant = restaurant;
    }

    public void printMenu() {
        Iterator<MenuItem> cakeIterator = cakeHouse.getIterator();
        Iterator<MenuItem> dinnerIterator = restaurant.getIterator();
        while(cakeIterator.hasNext()){
            System.out.println(cakeIterator.next());
        }
        while(dinnerIterator.hasNext()){
            System.out.println(dinnerIterator.next());
        }

    }
}
