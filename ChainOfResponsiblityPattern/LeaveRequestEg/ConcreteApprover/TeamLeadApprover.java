package ChainOfResponsiblityPattern.LeaveRequestEg.ConcreteApprover;

import ChainOfResponsiblityPattern.LeaveRequestEg.LeaveApprover;
import ChainOfResponsiblityPattern.LeaveRequestEg.LeaveRequest;

public class TeamLeadApprover extends LeaveApprover {

    LeaveApprover nextLeaveApprover;

    @Override
    public void Approve(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays()<7){
            System.out.println("this leave is approved by teamlead");
        }else if(nextLeaveApprover!=null){
            nextLeaveApprover.Approve(leaveRequest);
        }
    }

    @Override
    public void setNextLeaveApprover(LeaveApprover lv) {
       this.nextLeaveApprover=lv;
    }
}
