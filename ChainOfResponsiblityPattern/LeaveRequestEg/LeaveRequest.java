package ChainOfResponsiblityPattern.LeaveRequestEg;

public class LeaveRequest {
    int days;
    String employee;

    public LeaveRequest(int days,String name){
        this.days=days;
        this.employee=name;
    }
    public int getDays(){
        return this.days;
    }
    public String getEmployee(){
        return this.employee;
    }
}
