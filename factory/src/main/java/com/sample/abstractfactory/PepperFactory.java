package com.sample.abstractfactory;

import com.sample.entity.AppleDrink;
import com.sample.entity.Drink;
import com.sample.entity.PepperPizza;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:20
 **/
public class PepperFactory implements  IFactory {
    @Override
    public Pizza createPizza() {
        return new PepperPizza();
    }

    @Override
    public Drink createDrink() {
        return new AppleDrink();
    }
}
