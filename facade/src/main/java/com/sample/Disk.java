package com.sample;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-27 11:43
 **/
public class Disk {

    private static final Disk DISK_INSTANCE= new Disk();
    private Disk(){

    }
    public static Disk getDiskInstance(){
        return DISK_INSTANCE;
    }
    public void start(){
        System.out.println("Disk started");
    }
    public void shutdown(){
        System.out.println("Disk is shutdown");
    }
}
