package com.sample.objectadapter;

import com.sample.voltage.ChinaVoltageInterface;
import com.sample.voltage.NotebookVoltageInterface;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-23 18:12
 **/
public class ChinaVoltageToNotebookAdapter implements NotebookVoltageInterface {
    private ChinaVoltageInterface chinaVoltageInterface;

    public ChinaVoltageToNotebookAdapter(ChinaVoltageInterface chinaVoltageInterface) {
        this.chinaVoltageInterface=chinaVoltageInterface;
    }

    @Override
    public void use12v() {
        System.out.println("notebook use 12v ");
        System.out.println(" notebook voltage use china voltage");
        chinaVoltageInterface.use220v();
    }
}
