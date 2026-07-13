package Questions.MeetingRoomBookingSystem.V1.MeetingRoomAllocationStrategy;

import Questions.MeetingRoomBookingSystem.V1.Objects.MeetingRoom;
import Questions.MeetingRoomBookingSystem.V1.Objects.MeetingRoomManager;
import Questions.MeetingRoomBookingSystem.V1.Objects.Slot;

import java.util.List;

public interface MeetingRoomAllocationStrategy {
    public MeetingRoom findRoom(List<MeetingRoom>list);
}
