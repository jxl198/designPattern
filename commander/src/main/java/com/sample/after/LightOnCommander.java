package com.sample.after;

import com.sample.entity.Light;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:37
 **/
public class LightOnCommander implements Commander {
    private Light light;

    public LightOnCommander() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();

    }
}
