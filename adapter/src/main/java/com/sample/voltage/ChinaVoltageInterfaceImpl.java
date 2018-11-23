package com.sample.voltage;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-23 18:10
 **/
public class ChinaVoltageInterfaceImpl implements ChinaVoltageInterface {
    @Override
    public void use220v() {
        System.out.println("this is 220v");
    }
}
