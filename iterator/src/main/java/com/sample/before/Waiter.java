package com.sample.before;

import com.sample.entity.MenuItem;

import java.util.List;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-30 10:58
 **/
public class Waiter {
    private CakeHouse house;
    private DinnerRestaurant dinnerRestaurant;

    public Waiter(CakeHouse cakeHouse,DinnerRestaurant restaurant){
        this.house = cakeHouse;
        this.dinnerRestaurant = restaurant;
    }

    public void printAllMenus(){
       MenuItem[] menuItems =  this.house.getMenuItems();
       for(int i =0; i<this.house.getCount();i++){
            System.out.println(menuItems[i]);
        }

        List<MenuItem> menuItemList = this.dinnerRestaurant.getMenuItemList();
       for(int i =0; i<menuItemList.size();i++){
           System.out.println(menuItemList.get(i));
       }
    }
}
