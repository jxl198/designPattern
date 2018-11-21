package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:16
 **/
public abstract class Drink {

    private String name ;
    public Drink(String name){
        this.name =name;
    }

    public abstract  void prepare();
    public void box(){
        System.out.println(this.name+" is boxed");
    }
}
