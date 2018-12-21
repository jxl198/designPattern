package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:48
 **/
public class CompleteState implements State {
    public CompleteState(OaFlow oaFlow) {
    }


    @Override
    public void commit() {
        System.out.println("工单已结束");
    }

    @Override
    public void leaderApproval(int result) {
        System.out.println("工单已结束");

    }

    @Override
    public void managerApproval(int result) {
        System.out.println("工单已结束");
    }
}
