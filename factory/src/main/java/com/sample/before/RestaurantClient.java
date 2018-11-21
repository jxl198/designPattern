package com.sample.before;

import com.sample.entity.BaconPizza;
import com.sample.entity.CheesePizza;
import com.sample.entity.PepperPizza;
import com.sample.entity.Pizza;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-20 18:18
 **/
public class RestaurantClient {
    public void  createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza =  new CheesePizza();
        }else if ("bacon".equals(type)){
            pizza=new  BaconPizza();
        }else if("pepper".equals(type)){
            pizza=new  PepperPizza();
        }

        if(pizza !=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
