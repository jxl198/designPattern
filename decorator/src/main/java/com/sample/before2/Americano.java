package com.sample.before2;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 11:53
 **/
public class Americano extends Coffee {
    public Americano(){
        super();
    }

    @Override
    public String getDescription() {
        StringBuffer desc= new StringBuffer();
        if(isSugar()){
            desc.append("add sugar,");
        }
        if(isMilk()){
            desc.append("add milk ,");
        }
        desc.append("americano");
       return desc.toString();
    }



    @Override
    public double getCost() {
       double cost= 3.0;
       if(isMilk()){
           cost+=1;
       }
       if(isSugar()){
           cost+=3;
       }

       return cost;
    }
}
