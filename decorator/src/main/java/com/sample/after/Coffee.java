package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 17:33
 **/
public abstract class Coffee {
    private String description;
    private double cost;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public  double getCost(){
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
