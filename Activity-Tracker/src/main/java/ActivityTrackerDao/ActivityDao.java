package ActivityTrackerDao;

import ActivityTrackerModel.Activity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

public class ActivityDao {
    protected ConnManager connectionManager;
    private static ActivityDao instance = null;
    protected ActivityDao() {
        connectionManager = new ConnManager();
    }
    public static ActivityDao getInstance() {
        if(instance == null) {
            instance = new ActivityDao();
        }
        return instance;
    }

    public Activity create(Activity activity) throws SQLException {
        String insertActivity = "";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        if (activity.getSummaryId() == 0) {
            if (activity.getActivityType().toLowerCase() == "walking" || activity.getActivityType().toLowerCase() == "running") {
                insertActivity = "INSERT INTO Values(SummaryId, StartTime, EndTime, Activity, Duration, Distance, Calories, Steps)" +
                        "VALUES(?,?,?,?,?,?,?,?);";
                try {

                    connection = connectionManager.getConnection();
                    insertStmt = connection.prepareStatement(insertActivity);
                    insertStmt.setInt(1, activity.getSummaryId());
                    insertStmt.setTimestamp(2, activity.getStartTime());
                    insertStmt.setTimestamp(3, activity.getEndTime());
                    insertStmt.setString(4, activity.getActivityType());
                    insertStmt.setDouble(5, activity.getDuration());
                    insertStmt.setDouble(6, activity.getDistance());
                    insertStmt.setInt(7, activity.getCalories());
                    insertStmt.setInt(8, activity.getSteps());
                    insertStmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            } else if (activity.getActivityType().toLowerCase() == "cycling") {
                insertActivity = "INSERT INTO Values(SummaryId, StartTime, EndTime, Activity, Duration, Distance, Calories)" +
                        "VALUES(?,?,?,?,?,?,?);";
                try {
                    connection = connectionManager.getConnection();
                    insertStmt = connection.prepareStatement(insertActivity);
                    insertStmt.setInt(1, activity.getSummaryId());
                    insertStmt.setTimestamp(2, activity.getStartTime());
                    insertStmt.setTimestamp(3, activity.getEndTime());
                    insertStmt.setString(4, activity.getActivityType());
                    insertStmt.setDouble(5, activity.getDuration());
                    insertStmt.setDouble(6, activity.getDistance());
                    insertStmt.setInt(7, activity.getCalories());
                    insertStmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            } else {
                insertActivity = "INSERT INTO Values(SummaryId, StartTime, EndTime, Activity, Duration, Distance)" +
                        "VALUES(?,?,?,?,?,?);";
                try {
                    connection = connectionManager.getConnection();
                    insertStmt = connection.prepareStatement(insertActivity);
                    insertStmt.setInt(1, activity.getSummaryId());
                    insertStmt.setTimestamp(2, activity.getStartTime());
                    insertStmt.setTimestamp(3, activity.getEndTime());
                    insertStmt.setString(4, activity.getActivityType());
                    insertStmt.setDouble(5, activity.getDuration());
                    insertStmt.setDouble(6, activity.getDistance());
                    insertStmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            }
        } else if (activity.getPlaceTypeId() != 0) {
            if (activity.getActivityType().toLowerCase() == "walking" || activity.getActivityType().toLowerCase() == "running") {
                insertActivity = "INSERT INTO Values(PlaceTypeId, StartTime, EndTime, Activity, Duration, Distance, Calories, Steps)" +
                        "VALUES(?,?,?,?,?,?,?,?);";
                try {

                    connection = connectionManager.getConnection();
                    insertStmt = connection.prepareStatement(insertActivity);
                    insertStmt.setInt(1, activity.getPlaceTypeId());
                    insertStmt.setTimestamp(2, activity.getStartTime());
                    insertStmt.setTimestamp(3, activity.getEndTime());
                    insertStmt.setString(4, activity.getActivityType());
                    insertStmt.setDouble(5, activity.getDuration());
                    insertStmt.setDouble(6, activity.getDistance());
                    insertStmt.setInt(7, activity.getCalories());
                    insertStmt.setInt(8, activity.getSteps());
                    insertStmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            } else if (activity.getActivityType().toLowerCase() == "cycling") {
                insertActivity = "INSERT INTO Values(PlaceTypeId, StartTime, EndTime, Activity, Duration, Distance, Calories)" +
                        "VALUES(?,?,?,?,?,?,?);";
                try {
                    connection = connectionManager.getConnection();
                    insertStmt = connection.prepareStatement(insertActivity);
                    insertStmt.setInt(1, activity.getPlaceTypeId());
                    insertStmt.setTimestamp(2, activity.getStartTime());
                    insertStmt.setTimestamp(3, activity.getEndTime());
                    insertStmt.setString(4, activity.getActivityType());
                    insertStmt.setDouble(5, activity.getDuration());
                    insertStmt.setDouble(6, activity.getDistance());
                    insertStmt.setInt(7, activity.getCalories());
                    insertStmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            } else {
                insertActivity = "INSERT INTO Values(PlaceTypeId, StartTime, EndTime, Activity, Duration, Distance)" +
                        "VALUES(?,?,?,?,?,?);";
                try {
                    connection = connectionManager.getConnection();
                    insertStmt = connection.prepareStatement(insertActivity);
                    insertStmt.setInt(1, activity.getPlaceTypeId());
                    insertStmt.setTimestamp(2, activity.getStartTime());
                    insertStmt.setTimestamp(3, activity.getEndTime());
                    insertStmt.setString(4, activity.getActivityType());
                    insertStmt.setDouble(5, activity.getDuration());
                    insertStmt.setDouble(6, activity.getDistance());
                    insertStmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            }

        }
        return activity;
    }
}
