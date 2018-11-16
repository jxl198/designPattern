package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 17:35
 **/
//抽象装饰器
public abstract class CoffeeDecorator extends Coffee {

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public double getCost(){
        return super.getCost()+coffee.getCost();
    }

    public String getDescription(){
        return super.getDescription()+","+coffee.getDescription();
    }
}
