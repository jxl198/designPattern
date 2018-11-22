package com.sample.after;

import com.sample.entity.Light;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:37
 **/
public class LightOffCommander implements  Commander{
    private Light light;

    public LightOffCommander(){
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.off();

    }

    @Override
    public void undo() {
        light.on();

    }
}
