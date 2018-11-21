package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-20 18:14
 **/
public abstract class Pizza {

    private String name ;
    public Pizza(String name){
        this.name = name;
    }

    public abstract void  prepare();
    public void bake(){
        System.out.println(name+" is baked");
    }
    public void cut(){
        System.out.println(name+" is cut");
    }
    public void box(){
        System.out.println(name+" is boxed");
    }

    public String getName() {
        return name;
    }
}
