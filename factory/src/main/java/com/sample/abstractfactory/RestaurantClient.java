package com.sample.abstractfactory;

import com.sample.entity.Drink;
import com.sample.entity.Pizza;
import com.sample.factorymethod.BaconPizzaFactory;
import com.sample.factorymethod.CheesePizzaFactory;
import com.sample.factorymethod.IPizzaFactory;
import com.sample.factorymethod.PepperPizzaFactory;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:20
 **/
public class RestaurantClient {

    public void  createPizza(String type){
        IFactory factory =FactoryCreator.createFactory(type);
        Pizza pizza = factory.createPizza();
        if(pizza !=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        Drink drink = factory.createDrink();
        if(drink!=null){
            drink.prepare();
            drink.box();
        }
    }

    public void  createPizza(Class<? extends IFactory> clazz) throws InstantiationException, IllegalAccessException {
        IFactory factory =FactoryCreator.createFactory(clazz);
        Pizza pizza = factory.createPizza();
        if(pizza !=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        Drink drink = factory.createDrink();
        if(drink!=null){
            drink.prepare();
            drink.box();
        }
    }
}
