package Questions.MeetingRoomBookingSystem.V1.MeetingRoomAllocationStrategy.Implementations;

import Questions.MeetingRoomBookingSystem.V1.MeetingRoomAllocationStrategy.MeetingRoomAllocationStrategy;
import Questions.MeetingRoomBookingSystem.V1.Objects.MeetingRoom;
import Questions.MeetingRoomBookingSystem.V1.enums.RoomFeatures;

import java.util.List;
import java.util.Set;

public class LargestScreen implements MeetingRoomAllocationStrategy {
    @Override
    public MeetingRoom findRoom(List<MeetingRoom> list) {
        for (int i = 0; i < list.size(); i++) {
           Set<RoomFeatures> features=list.get(i).getFeatureslist();
           for(int j=0;j<features.size();j++){
               if(features.contains(RoomFeatures.LARGE_SCREEN)){
                   list.get(i);
               }
           }
        }
        return null;
    }
}
