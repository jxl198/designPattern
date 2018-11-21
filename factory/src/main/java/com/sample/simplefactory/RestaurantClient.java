package com.sample.simplefactory;

import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 10:04
 **/
public class RestaurantClient {
    public void  productPizza(String type){
       Pizza pizza = PizzaFactory.createPizza(type);
        if(pizza !=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
