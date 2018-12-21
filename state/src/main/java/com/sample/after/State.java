package com.sample.after;

/**
 * @author jiangxl
 * @description
 * @date 2018-12-21 16:42
 **/
public interface State {

   public void commit();
   public void leaderApproval(int result);
   public void managerApproval(int result);

}
