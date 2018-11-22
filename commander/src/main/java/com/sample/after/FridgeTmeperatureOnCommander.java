package com.sample.after;

import com.sample.entity.Fridge;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:38
 **/
public class FridgeTmeperatureOnCommander implements  Commander {
    private Fridge fridge;

    public FridgeTmeperatureOnCommander(){
        this.fridge =new Fridge();
    }
    @Override
    public void execute() {
        fridge.temperatureUp();

    }

    @Override
    public void undo() {
        fridge.temperatureDown();

    }
}
