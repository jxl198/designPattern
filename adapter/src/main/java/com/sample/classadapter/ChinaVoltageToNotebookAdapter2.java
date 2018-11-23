package com.sample.classadapter;

import com.sample.voltage.ChinaVoltageInterface;
import com.sample.voltage.ChinaVoltageInterfaceImpl;
import com.sample.voltage.NotebookVoltageInterface;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-23 18:19
 **/
public class ChinaVoltageToNotebookAdapter2 extends ChinaVoltageInterfaceImpl implements NotebookVoltageInterface {

    @Override
    public void use12v() {
        System.out.println("notebook use 12v ");
        System.out.println(" notebook voltage use china voltage");
        super.use220v();
    }
}
