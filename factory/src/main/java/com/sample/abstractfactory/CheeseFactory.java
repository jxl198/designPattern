package com.sample.abstractfactory;

import com.sample.entity.CheesePizza;
import com.sample.entity.Drink;
import com.sample.entity.OrangeDrink;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:19
 **/
public class CheeseFactory implements  IFactory{
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }

    @Override
    public Drink createDrink() {
        return new OrangeDrink();
    }
}
