package Questions.MeetingRoomBookingSystem.V1.Objects;

import java.util.List;

public class Booking {
    int id;
    String title;
    User host;
    Slot slot;
    List<User> participants;

    public Booking(List<User> participants, Slot slot, User host, String title, int id) {
        this.participants = participants;
        this.slot = slot;
        this.host = host;
        this.title = title;
        this.id = id;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

}
