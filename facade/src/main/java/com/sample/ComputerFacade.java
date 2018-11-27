package com.sample;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-27 11:43
 **/
public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade() {
        cpu = Cpu.getCpuInstance();
        disk = Disk.getDiskInstance();
        memory = Memory.getMemoryInstance();

    }

    public void startCompute() {
        memory.start();
        cpu.start();
        disk.start();
    }

    public void shutdownCompute() {
        memory.shutdown();
        cpu.shutdown();
        disk.shutdown();
    }
}
