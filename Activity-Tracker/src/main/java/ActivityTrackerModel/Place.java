package ActivityTrackerModel;

public class Place {
    public enum PlaceType{UNKNOWN, HOME, FOURSQUARE}
    private int placeTypeId;
    private int segmentId;
    private int placeId;
    private String name;
    private PlaceType type;

    public Place(int placeTypeId, int segmentId, int placeId, String name, PlaceType type) {
        this.placeTypeId = placeTypeId;
        this.segmentId = segmentId;
        this.placeId = placeId;
        this.name = name;
        this.type = type;
    }

    public Place(int segmentId, int placeId, String name, PlaceType type) {
        this.segmentId = segmentId;
        this.placeId = placeId;
        this.name = name;
        this.type = type;
    }

    public void setPlaceTypeId(int placeTypeId) {
        this.placeTypeId = placeTypeId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(PlaceType type) {
        this.type = type;
    }

    public int getPlaceTypeId() {
        return placeTypeId;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public int getPlaceId() {
        return placeId;
    }

    public String getName() {
        return name;
    }

    public PlaceType getType() {
        return type;
    }
}
