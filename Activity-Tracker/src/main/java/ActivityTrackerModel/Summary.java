package ActivityTrackerModel;

import java.sql.Date;

public class Summary {
    private int summaryId;
    private Date date;

    public Summary(int summaryId, Date date) {
        this.summaryId = summaryId;
        this.date = date;
    }

    public Summary(Date date) {
        this.date = date;
    }

    public int getSummaryId() {
        return summaryId;
    }

    public Date getDate() {
        return date;
    }

    public void setSummaryId(int summaryId) {
        this.summaryId = summaryId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
