package com.sample.before;

import com.sample.entity.Fridge;
import com.sample.entity.Light;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 10:22
 **/
public class Controller {
    private Light light = new Light();
    private Fridge fridge = new Fridge();

    public void invoke(int slot) {
        switch (slot) {
            case 1:
                light.on();
            case 2:
                light.off();
            case 3:
                fridge.on();
            case 4:
                fridge.off();
            case 5:
                fridge.temperatureUp();
            case 6:
                fridge.temperatureDown();
            default:
                break;
        }
    }
}
