package Questions.ParkingLot.V3.Objects;

public class SpotAllocation {
    int floorId;
    int spotId;

    public SpotAllocation(int floorId, int spotId) {
        this.floorId = floorId;
        this.spotId = spotId;
    }

    public int getFloorId() {
        return floorId;
    }

    public int getSpotId() {
        return spotId;
    }
}
