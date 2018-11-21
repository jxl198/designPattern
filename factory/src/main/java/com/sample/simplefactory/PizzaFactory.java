package com.sample.simplefactory;

import com.sample.entity.BaconPizza;
import com.sample.entity.CheesePizza;
import com.sample.entity.PepperPizza;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 10:03
 **/
public class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza =  new CheesePizza();
        }else if ("bacon".equals(type)){
            pizza=new BaconPizza();
        }else if("pepper".equals(type)){
            pizza=new PepperPizza();
        }
        return pizza;
    }
}
