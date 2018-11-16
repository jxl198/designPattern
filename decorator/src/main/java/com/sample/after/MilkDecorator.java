package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 18:00
 **/
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee){
        super(coffee);
        super.setCost(5);
        super.setDescription("add milk");
    }
}
