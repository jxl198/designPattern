package com.sample.voltage;

import com.sample.voltage.NotebookVoltageInterface;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-23 18:11
 **/
public class NotebookVoltageInterfaceImpl implements NotebookVoltageInterface {


    @Override
    public void use12v() {
        System.out.println("this is 12v");

    }
}
