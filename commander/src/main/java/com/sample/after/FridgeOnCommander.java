package com.sample.after;

import com.sample.entity.Fridge;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:38
 **/
public class FridgeOnCommander implements  Commander{
    private Fridge fridge;
    public FridgeOnCommander(){
        fridge = new Fridge();
    }
    @Override
    public void execute() {
        fridge.on();

    }

    @Override
    public void undo() {
        fridge.off();

    }
}
