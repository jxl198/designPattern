package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 17:36
 **/
public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee){
        super(coffee);
        super.setCost(2);
        super.setDescription(" add sugar");

    }


}
