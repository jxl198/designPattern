package com.sample.before;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:29
 **/
public class TestApp {
    public static void main(String[] args) {
        OaFlow flow = new OaFlow();
        flow.commit();
        flow.leaderApproval(1);
        flow.managerApproval(1);
    }
}
