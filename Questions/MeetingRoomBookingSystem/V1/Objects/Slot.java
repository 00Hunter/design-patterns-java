package Questions.MeetingRoomBookingSystem.V1.Objects;

import Questions.MeetingRoomBookingSystem.V1.enums.MeetingStatus;

import java.time.LocalDateTime;

public class Slot {
    int id;
    MeetingStatus status;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public Slot( LocalDateTime endTime, LocalDateTime startTime, MeetingStatus status) {
        this.endTime = endTime;
        this.startTime = startTime;
        this.status = status;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public MeetingStatus getStatus() {
        return status;
    }

    public void setStatus(MeetingStatus status) {
        this.status = status;
    }

    public boolean overlaps(Slot other) {
        if (!startTime.toLocalDate().equals(other.startTime.toLocalDate())) {
            return false;
        }

        return startTime.isBefore(other.endTime)
                && endTime.isAfter(other.startTime);
    }
}
