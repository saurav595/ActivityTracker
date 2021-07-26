package ActivityTrackerDao;

import ActivityTrackerModel.Summary;
import ActivityTrackerModel.Summary.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SummaryDao {
    protected ConnManager connectionManager;
    private static SummaryDao instance = null;
    protected SummaryDao() {
        connectionManager = new ConnManager();
    }
    public static SummaryDao getInstance() {
        if(instance == null) {
            instance = new SummaryDao();
        }
        return instance;
    }

    public Summary create(Summary summary) throws SQLException {
        String insertSummary = "INSERT INTO Summary(Date) VALUES (?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        try {
            connection = connectionManager.getConnection();
            insertStmt = connection.prepareStatement(insertSummary);
            insertStmt.setDate(1, summary.getDate());
            insertStmt.executeUpdate();
            return summary;

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
