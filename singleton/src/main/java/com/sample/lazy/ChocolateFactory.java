package com.sample.lazy;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-19 10:36
 **/
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;

    private static ChocolateFactory INSTANCE = null;

    private ChocolateFactory() {
        this.empty = true;
        this.boiled = false;
    }

    //线程不安全
    public static ChocolateFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ChocolateFactory();
        }
        return INSTANCE;
    }

    //线程安全
    public synchronized static ChocolateFactory getInstanteThreadSec() {
        if (INSTANCE == null) {
            INSTANCE = new ChocolateFactory();
    }
        return INSTANCE;
    }

}
