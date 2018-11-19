package com.sample.lazy.doublelock;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-19 10:47
 **/
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;

    private  volatile static ChocolateFactory INSTANCE= null;

    private ChocolateFactory(){
        this.empty=true;
        this.boiled=false;
    }

    public static ChocolateFactory getInstante(){
        if(INSTANCE==null){
            synchronized (ChocolateFactory.class){
                if(INSTANCE==null){
                    INSTANCE = new ChocolateFactory();
                }
            }
        }
        return INSTANCE;
    }

}
