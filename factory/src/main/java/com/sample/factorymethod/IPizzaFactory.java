package com.sample.factorymethod;

import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 10:26
 **/
public interface IPizzaFactory {
    Pizza createPizza();
}
