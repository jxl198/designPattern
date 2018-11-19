package com.sample.lazy.innerclass;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-19 10:55
 **/
public class ChocolateFactory {

    private boolean empty;
    private boolean boiled;

    private ChocolateFactory() {
        this.empty = true;
        this.boiled = false;
    }

    //线程安全且是懒加载的
    public static class ChocolateFactoryHolder {
        private volatile static ChocolateFactory INSTANCE = new ChocolateFactory();
    }
    public static ChocolateFactory getInstance() {
        return ChocolateFactoryHolder.INSTANCE;
    }
}
