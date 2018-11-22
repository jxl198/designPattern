package com.sample.after;

import com.sample.entity.Fridge;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:38
 **/
public class FridgeOffCommander implements Commander {
    private Fridge fridge;

    public FridgeOffCommander() {
        fridge = new Fridge();
    }

    @Override
    public void execute() {
        fridge.off();
    }

    @Override
    public void undo() {
        fridge.on();

    }
}
