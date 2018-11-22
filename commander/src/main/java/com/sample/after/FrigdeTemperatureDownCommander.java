package com.sample.after;

import com.sample.entity.Fridge;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:39
 **/
public class FrigdeTemperatureDownCommander implements Commander {
    private Fridge fridge;

    public FrigdeTemperatureDownCommander() {
        this.fridge = new Fridge();
    }

    @Override
    public void execute() {
        fridge.temperatureDown();

    }

    @Override
    public void undo() {
        fridge.temperatureUp();

    }
}
