package com.sample.entity;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-28 17:50
 **/
public class MenuItem {
    private String name;
    private String description;
    private float price;

    public MenuItem(String name,String description,float price){
        this.name =name;
        this.description =description;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
