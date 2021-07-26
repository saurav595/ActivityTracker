package ActivityTrackerModel;

import java.sql.Date;
import java.sql.Timestamp;

public class SegmentTypes {
    public enum segmentType {MOVE, PLACE}
    private int segmentId;
    private Date date;
    private segmentType type;
    private Timestamp startTime;
    private Timestamp endTime;
    private Date lastUpdate;

    public SegmentTypes(int segmentId, Date date, segmentType type, Timestamp startTime, Timestamp endTime, Date lastUpdate) {
        this.segmentId = segmentId;
        this.date = date;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lastUpdate = lastUpdate;
    }

    public SegmentTypes(Date date, segmentType type, Timestamp startTime, Timestamp endTime, Date lastUpdate) {
        this.date = date;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lastUpdate = lastUpdate;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public Date getDate() {
        return date;
    }
    public segmentType getType() {

        return type;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(segmentType type) {
        this.type = type;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
