package ChainOfResponsiblityPattern.LeaveRequestEg;

abstract public class LeaveApprover {
    LeaveApprover nextLeaveApprover;

    public void setNextLeaveApprover(LeaveApprover lv){
        this.nextLeaveApprover=lv;
    }
    public void Approve(LeaveRequest leaveRequest){

    }
}
