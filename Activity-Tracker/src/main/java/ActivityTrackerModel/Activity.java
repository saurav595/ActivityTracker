package ActivityTrackerModel;

import java.sql.Timestamp;

public class Activity {
    private int activityTypeId;
    private int segmentId;
    private int summaryId;
    private int placeTypeId;
    private Timestamp startTime;
    private Timestamp endTime;
    private String activityType;
    private double duration;
    private double distance;
    private int calories;
    private int steps;

    public Activity(int activityTypeId, int segmentId, int summaryId, int placeTypeId, Timestamp startTime, Timestamp endTime, String activityType, double duration, double distance, int calories, int steps) {
        this.activityTypeId = activityTypeId;
        this.segmentId = segmentId;
        this.summaryId = summaryId;
        this.placeTypeId = placeTypeId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityType = activityType;
        this.duration = duration;
        this.distance = distance;
        this.calories = calories;
        this.steps = steps;
    }

    public Activity(int summaryId) {
        this.summaryId = summaryId;
    }



    public int getActivityTypeId() {
        return activityTypeId;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public int getSummaryId() {
        return summaryId;
    }

    public int getPlaceTypeId() {
        return placeTypeId;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setActivityTypeId(int activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public void setSummaryId(int summaryId) {
        this.summaryId = summaryId;
    }

    public void setPlaceTypeId(int placeTypeId) {
        this.placeTypeId = placeTypeId;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public String getActivityType() {
        return activityType;
    }

    public double getDuration() {
        return duration;
    }

    public double getDistance() {
        return distance;
    }

    public int getCalories() {
        return calories;
    }

    public int getSteps() {
        return steps;
    }
}
