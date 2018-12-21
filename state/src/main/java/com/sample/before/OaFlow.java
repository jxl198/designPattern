package com.sample.before;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-06 17:09
 **/
public class OaFlow {
    private static final int UN_COMMITED = 0;
    private static final int COMMITED = 1;
    private static final int LEADER_APPRVOVAL = 2;
    private static final int COMPLETE = 4;


    private int state = UN_COMMITED;

    public void commit() {  //员工提交请假单
        switch (state) {
            case UN_COMMITED:
                System.out.println("提交成功");
                state = COMMITED;
                break;
            case COMMITED:
                System.out.println("不能重复提交");
                break;
            case LEADER_APPRVOVAL:
                System.out.println("工单已经在审核，不能重复提交");
                break;

            case COMPLETE:
                System.out.println("工单已审核完成，不能重复提交");
                break;
            default:
                break;

        }

    }

    public void leaderApproval(int result) {  //直属上级审批
        switch (state) {
            case UN_COMMITED:
                System.out.println("员工还未提交，不能审核");
                break;
            case COMMITED:
                if(result == 1){
                    System.out.println("直属上级审核通过");
                    state= LEADER_APPRVOVAL;
                }
                else {
                    System.out.println("直属上级审核不通过，直接结束");
                    state = COMPLETE;
                }
                break;
            case LEADER_APPRVOVAL:
                System.out.println("不能重复审核");
                break;
            case COMPLETE:
                System.out.println("工单已审核完成，不能重新审核");
                break;
            default:
                break;

        }

    }

    public void managerApproval(int result) {  //部门领导审批
        switch (state) {
            case UN_COMMITED:
                System.out.println("员工还未提交，不能审核");
                break;
            case COMMITED:
                System.out.println("直属领导必须还未审核");
                break;
            case LEADER_APPRVOVAL:
                state= COMPLETE;
                if(result ==1){

                    System.out.println("部门领导审核通过，结束");
                }
                else {

                    System.out.println("部门领导审核不通过，结束");
                }
                break;
            case COMPLETE:
                System.out.println("工单已审核完成，不能重新审核");
                break;
            default:
                break;
        }

    }
}
