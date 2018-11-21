package com.sample.abstractfactory;

import com.sample.entity.Drink;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 10:26
 **/
public interface IFactory {
    Pizza createPizza();
    Drink createDrink();
}
