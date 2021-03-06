package com.sample.before;

import com.sample.entity.MenuItem;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-28 17:50
 **/
public class CakeHouse {
    private MenuItem[] menuItems;
    private int count = 0;
    private int maxCount = 10;

    public CakeHouse() {
        menuItems = new MenuItem[maxCount];
    }

    public void addItem(MenuItem menuItem) {
        if (count == maxCount) {
            return;
        }
        menuItems[count++] = menuItem;
    }

    public int getCount() {
        return count;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
}
