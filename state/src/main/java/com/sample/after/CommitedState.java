package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:43
 **/
public class CommitedState implements State {
    private OaFlow oaFlow;

    public CommitedState(OaFlow oaFlow){
        this.oaFlow = oaFlow;
    }


    @Override
    public void commit() {
        System.out.println("工单已提交，不能重复提交");
    }

    @Override
    public void leaderApproval(int result) {
        if(result ==1){
            System.out.println("直属领导审核通过");
            oaFlow.setState(oaFlow.leaderApprovalState);

        }else {
            System.out.println("直属领导审核不通过，直接结束");
            oaFlow.setState(oaFlow.completeState);

        }
    }

    @Override
    public void managerApproval(int result) {
        System.out.println("直属领导还未审批");
    }
}
