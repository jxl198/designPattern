package com.sample.factorymethod;

import com.sample.entity.PepperPizza;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 10:28
 **/
public class PepperPizzaFactory implements  IPizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PepperPizza();
    }
}
