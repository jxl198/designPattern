package com.sample.java;

import com.sample.entity.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-30 10:55
 **/
public class DinnerRestaurant {
    private List<MenuItem> menuItemList;
    private int currentIndex = 0;

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


    public Iterator getIterator(){
        return new DinnerIterator();
    }
    private class DinnerIterator implements Iterator<MenuItem> {

        @Override
        public boolean hasNext() {
            return currentIndex < menuItemList.size();
        }

        @Override
        public MenuItem next() {
            return menuItemList.get(currentIndex++);
        }

        @Override
        public void remove() {

        }
    }
}
