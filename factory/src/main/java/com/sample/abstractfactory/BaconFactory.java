package com.sample.abstractfactory;

import com.sample.entity.BaconPizza;
import com.sample.entity.Drink;
import com.sample.entity.OrangeDrink;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:15
 **/
public class BaconFactory implements  IFactory{

    @Override
    public Pizza createPizza() {
        return new BaconPizza();
    }

    @Override
    public Drink createDrink() {
        return new OrangeDrink();
    }
}
