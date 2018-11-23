package com.sample.objectadapter;

import com.sample.voltage.ChinaVoltageInterface;
import com.sample.voltage.ChinaVoltageInterfaceImpl;
import com.sample.voltage.NotebookVoltageInterface;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-23 18:14
 **/
public class TestAPP {
    public static void main(String[] args) {
        ChinaVoltageInterface chinaVoltageInterface = new ChinaVoltageInterfaceImpl();
        NotebookVoltageInterface notebookVoltageInterface = new ChinaVoltageToNotebookAdapter(chinaVoltageInterface);
        notebookVoltageInterface.use12v();
    }
}
