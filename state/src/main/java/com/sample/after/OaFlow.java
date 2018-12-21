package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:45
 **/
public class OaFlow {

    private State state;

    public State unCommitedState;
    public State commitedState;
    public State leaderApprovalState;
    public State completeState;

    public OaFlow(){

        this.unCommitedState  = new UnCommitedState(this);
        this.commitedState =  new CommitedState(this);
        this.leaderApprovalState = new LeaderApprovalSate(this);
        this.completeState = new CompleteState(this);
        state = unCommitedState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public  void commit(){
        state.commit();
    }
    public void leaderApproval(int result){
        state.leaderApproval(result);
    }

    public void managerApproval(int result){
        state.managerApproval(result);
    }

}
