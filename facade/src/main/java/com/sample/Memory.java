package com.sample;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-27 11:43
 **/
public class Memory {

    private static final Memory MEMORY_INSTANCE= new Memory();
    private Memory(){

    }
    public static Memory getMemoryInstance(){
        return MEMORY_INSTANCE;
    }
    public void start(){
        System.out.println("Memory started");
    }
    public void shutdown(){
        System.out.println("Memory is shutdown");
    }
}
