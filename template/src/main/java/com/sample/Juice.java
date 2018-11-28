package com.sample;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-28 15:46
 **/
public abstract class Juice {

    public final void makeJuice(){
        prepare();
        press();
        filter();
        pack();
    }
    private void press() {
        System.out.println("fruit is pressed");
    }

    private void pack() {
        System.out.println("juice is packed");
    }

    private void filter() {
        System.out.println("juice is filtered");
    }

    protected abstract void prepare();


}
