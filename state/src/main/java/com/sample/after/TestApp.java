package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:59
 **/
public class TestApp {
    public static void main(String[] args) {
        OaFlow oaFlow = new OaFlow();
        oaFlow.commit();
        oaFlow.leaderApproval(1);
        oaFlow.managerApproval(0);
//        oaFlow.commit();
    }
}
