package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:47
 **/
public class UnCommitedState implements State{
    private OaFlow oaFlow;
    public UnCommitedState(OaFlow oaFlow){
        this.oaFlow = oaFlow;
    }

    @Override
    public void commit() {
        System.out.println("工单已提交");
        oaFlow.setState(oaFlow.commitedState);
    }

    @Override
    public void leaderApproval(int result) {
        System.out.println("工单还未提交，不能审核");
    }

    @Override
    public void managerApproval(int result) {
        System.out.println("工单还未提交，不能审核");

    }
}
