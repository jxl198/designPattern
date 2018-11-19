package com.sample.starve;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-19 10:42
 **/
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;
    private static ChocolateFactory INSTANCE = new ChocolateFactory();
    private ChocolateFactory() {
        this.empty = true;
        this.boiled = false;
    }
    public static ChocolateFactory getInstance(){
        return INSTANCE;
    }
}
