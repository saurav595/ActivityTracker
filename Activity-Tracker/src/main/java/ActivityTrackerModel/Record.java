package ActivityTrackerModel;

import java.sql.Date;
import java.sql.Timestamp;

public class Record {
    private String date;
    private int calorieIdle;
    private String lastUpdate;

    public Record(String date, int calorieIdle, String lastUpdate) {
        this.date = date;
        this.calorieIdle = calorieIdle;
        this.lastUpdate = lastUpdate;
    }

    public String getDate() {
        return date;
    }

    public int getCalorieIdle() {
        return calorieIdle;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCalorieIdle(int calorieIdle) {
        this.calorieIdle = calorieIdle;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
