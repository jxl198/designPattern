package com.sample.classadapter;

import com.sample.voltage.NotebookVoltageInterface;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-23 18:21
 **/
public class TestAPP {
    public static void main(String[] args) {
        NotebookVoltageInterface notebookVoltageInterface =new ChinaVoltageToNotebookAdapter2();
        notebookVoltageInterface.use12v();
    }
}
