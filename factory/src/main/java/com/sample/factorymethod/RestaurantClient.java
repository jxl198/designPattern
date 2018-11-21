package com.sample.factorymethod;

import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:04
 **/
public class RestaurantClient {
    public void  createPizza(String type){
       IPizzaFactory factory =null;
        if("cheese".equals(type)){
            factory =  new CheesePizzaFactory();
        }else if ("bacon".equals(type)){
            factory=new BaconPizzaFactory();
        }else if("pepper".equals(type)){
            factory=new PepperPizzaFactory();
        }
        Pizza pizza = factory.createPizza();
        if(pizza !=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
