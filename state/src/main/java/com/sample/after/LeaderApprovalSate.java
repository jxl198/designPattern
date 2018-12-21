package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:48
 **/
public class LeaderApprovalSate implements State {
    private OaFlow oaFlow;

    public LeaderApprovalSate(OaFlow oaFlow) {
        this.oaFlow = oaFlow;
    }


    @Override
    public void commit() {
        System.out.println("工单已经在审核，不能重复提交");
    }

    @Override
    public void leaderApproval(int result) {
        System.out.println("直属上级已经审核，不能重复审核");

    }

    @Override
    public void managerApproval(int result) {
        oaFlow.setState(oaFlow.completeState);
        if (result == 1) {
            System.out.println("部门领导审核通过，工单结束");
        } else {
            System.out.println("部门领导审核不通过，工单结束");
        }
    }
}
