package Questions.MeetingRoomBookingSystem.V1.Objects;

import Questions.MeetingRoomBookingSystem.V1.enums.RoomFeatures;
import Questions.MeetingRoomBookingSystem.V1.enums.RoomStatus;

import java.time.LocalDateTime;
import java.util.*;

public class MeetingRoom {
    List<Slot>bookedSlots;
    int Capacity;
    RoomStatus status;
    Set<RoomFeatures>featureslist;

    public MeetingRoom(int capacity) {
        this.bookedSlots = new ArrayList<>();
        this.status = status;
        Capacity = capacity;
        this.featureslist=new HashSet<>();
    }

    public boolean checkGivenSlot(Slot request){
        LocalDateTime startingTime=request.getStartTime();
        LocalDateTime endingTime=request.getEndTime();

        for(int i=0;i<bookedSlots.size();i++){
            Slot bookedSlot=bookedSlots.get(i);
            if(bookedSlot.overlaps(request)==true){
                return false;
            }
        }
        return true;
    }

    public void bookSlots(){}
    public void cancelSlots(){}
    public void completeMeeting(){}

    public Set<RoomFeatures> getFeatureslist() {
        return featureslist;
    }

    public void setFeatureslist(Set<RoomFeatures> featureslist) {
        this.featureslist = featureslist;
    }
}
