package ChainOfResponsiblityPattern.LeaveRequestEg.ConcreteApprover;

import ChainOfResponsiblityPattern.LeaveRequestEg.LeaveApprover;
import ChainOfResponsiblityPattern.LeaveRequestEg.LeaveRequest;

public class ManagerApprover extends LeaveApprover{
    LeaveApprover nextLeaveApprover;

    @Override
    public void setNextLeaveApprover(LeaveApprover lv) {
      this.nextLeaveApprover=lv;
    }

    @Override
    public void Approve(LeaveRequest leaveRequest) {
       if(leaveRequest.getDays()>7 && leaveRequest.getDays()<15){
           System.out.println("this leave is approved by manager");
       }else if(nextLeaveApprover!=null){
           nextLeaveApprover.Approve(leaveRequest);
       }
    }
}
