package Questions.MeetingRoomBookingSystem.V1.Objects;

public class User {
    int employeeId;
    String name ;
    String team;

    public User(String team, String name, int employeeId) {
        this.team = team;
        this.name = name;
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
