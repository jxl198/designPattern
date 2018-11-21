package com.sample.factorymethod;

import com.sample.entity.CheesePizza;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 10:27
 **/
public class CheesePizzaFactory implements IPizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
