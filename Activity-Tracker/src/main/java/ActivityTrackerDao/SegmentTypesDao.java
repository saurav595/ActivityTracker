package ActivityTrackerDao;

import ActivityTrackerModel.SegmentTypes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SegmentTypesDao {
    protected ConnManager connectionManager;
    private static SegmentTypesDao instance = null;
    protected SegmentTypesDao() {
        connectionManager = new ConnManager();
    }
    public static SegmentTypesDao getInstance() {
        if(instance == null) {
            instance = new SegmentTypesDao();
        }
        return instance;
    }

    public SegmentTypes create(SegmentTypes segmentType) throws SQLException {
        String insertSegmentType = "INSERT INTO SegmentTypes(Date, Type, StartTime, EndTime, LastUpdate) " +
                "VALUES(?,?,?,?,?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        try {
            connection = connectionManager.getConnection();
            insertStmt = connection.prepareStatement(insertSegmentType);
            insertStmt.setDate(1, segmentType.getDate());
            insertStmt.setString(2, segmentType.getType().name());
            insertStmt.setTimestamp(3, segmentType.getStartTime());
            insertStmt.setTimestamp(4, segmentType.getEndTime());
            insertStmt.setDate(5, segmentType.getLastUpdate());
            insertStmt.executeUpdate();
            return segmentType;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (insertStmt != null) {
                insertStmt.close();
            }
        }
    }
}
