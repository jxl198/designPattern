package com.sample.before;

import com.sample.entity.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-30 10:55
 **/
public class DinnerRestaurant {
    private List<MenuItem> menuItemList;

    public DinnerRestaurant() {
        menuItemList = new ArrayList<MenuItem>();
    }

    public void addItem(MenuItem menuItem) {
        menuItemList.add(menuItem);
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }
}
