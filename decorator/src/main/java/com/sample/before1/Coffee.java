package com.sample.before1;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 10:24
 **/
public class Coffee {
    private String description;
    private double cost;
    public Coffee(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
}
