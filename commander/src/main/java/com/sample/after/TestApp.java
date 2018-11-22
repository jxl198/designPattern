package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-22 11:35
 **/
public class TestApp {

    public static void main(String[] args) {
        ControlPannel panel = initPanel();
        panel.onButton(1);
        panel.onButton(2);
        panel.undoCommander();
        panel.undoCommander();
    }

    public static ControlPannel initPanel() {
        ControlPannel pannel = new ControlPannel();
        pannel.setCommanders(new LightOnCommander(), new LightOffCommander(), 0);
        pannel.setCommanders(new FridgeOnCommander(), new FridgeOffCommander(), 1);
        pannel.setCommanders(new FridgeTmeperatureOnCommander(), new FrigdeTemperatureDownCommander(), 2);
        return pannel;
    }
}
