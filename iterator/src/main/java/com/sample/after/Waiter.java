package com.sample.after;

import com.sample.entity.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentNavigableMap;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-30 11:36
 **/
public class Waiter {

    private List<Container> containerList;

    public Waiter() {
       containerList = new ArrayList<Container>();
    }

    public void addContainer(Container container) {
        containerList.add(container);
    }

    public void printMenu() {
        for(int i =0; i< containerList.size();i++){
            Container container = containerList.get(i);
            Iterator iterator =container.getIterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
