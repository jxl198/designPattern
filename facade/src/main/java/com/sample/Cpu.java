package com.sample;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-27 11:43
 **/
public class Cpu {

    private static final Cpu CPU_INSTANCE= new Cpu();
    private Cpu(){
    }
    public static Cpu getCpuInstance(){
        return CPU_INSTANCE;
    }
    public void start(){
        System.out.println("cpu started");
    }
    public void shutdown(){
        System.out.println("cpu is shutdown");
    }
}
