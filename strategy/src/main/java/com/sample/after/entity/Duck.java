package com.sample.after.entity;

import com.sample.after.behavior.FlyBehavior;
import com.sample.after.behavior.QuackBehavior;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:36
 **/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        this.flyBehavior=flyBehavior;
        this.quackBehavior=quackBehavior;
    }
    public void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }
    public  void swim(){
        System.out.println("i am swimming");
    }
    public abstract void display();
}
