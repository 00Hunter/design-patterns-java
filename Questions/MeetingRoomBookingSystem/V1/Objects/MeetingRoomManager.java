package Questions.MeetingRoomBookingSystem.V1.Objects;

import Questions.MeetingRoomBookingSystem.V1.MeetingRoomAllocationStrategy.MeetingRoomAllocationStrategy;
import Questions.MeetingRoomBookingSystem.V1.enums.RoomStatus;

import java.util.List;

public class MeetingRoomManager {
    List<MeetingRoom>meetingRoomList;
    MeetingRoomAllocationStrategy allocationStrategy;

    public MeetingRoom findMeetingRoom(Slot requestSlot){
        for (int i=0;i<meetingRoomList.size();i++){
            MeetingRoom mt=meetingRoomList.get(i);

            if(mt.status== RoomStatus.ACTIVE){
               MeetingRoom roomfound=allocationStrategy.findRoom(meetingRoomList);
                 if(roomfound.checkGivenSlot(requestSlot)!=false){
                     return roomfound;
                 }
            }
        }
        return null;
    }
    public void BookMeetingRoom(){}
    public void CancelMeeting(){}
    public void RescheduleMeeting(){}

}
