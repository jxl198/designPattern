package com.sample.before2;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-16 11:51
 **/
public class Coffee {
    private String description;
    private double cost;

    private boolean sugar;
    private boolean milk;

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

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }
}
