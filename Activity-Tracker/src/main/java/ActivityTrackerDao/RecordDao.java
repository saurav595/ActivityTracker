package ActivityTrackerDao;

import ActivityTrackerModel.Record;

import java.sql.*;
import java.util.ArrayList;

public class RecordDao {
    protected ConnManager connectionManager;
    private static RecordDao instance = null;
    protected RecordDao() {
        connectionManager = new ConnManager();
    }
    public static RecordDao getInstance() {
        if(instance == null) {
            instance = new RecordDao();
        }
        return instance;
    }

    public Record create(Record record) throws SQLException {
        String insertRecord = "INSERT INTO Record(date, calorieIdle, lastUpdate) VALUES(?,?,?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        try {
            connection = connectionManager.getConnection();
            insertStmt = connection.prepareStatement(insertRecord);
            insertStmt.setString(1, record.getDate());
            insertStmt.setInt(2, record.getCalorieIdle());
            insertStmt.setString(3, record.getLastUpdate());
            insertStmt.executeUpdate();
            return record;
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

    public ArrayList<Record> getAllRecords() throws SQLException {
        String getRecord = "SELECT * FROM Records";
        Connection connection = null;
        PreparedStatement selectStmt = null;
        ResultSet result = null;
        try {
            connection = connectionManager.getConnection();
            selectStmt = connection.prepareStatement(getRecord);
            result = selectStmt.executeQuery();
            ArrayList<Record> recordList = new ArrayList<Record>();

            while (result.next()) {
                String date = result.getString("Date");
                int calorieIdle = result.getInt("calorieIdle");
                String lastUpdate = result.getString("lastUpdate");
                Record r = new Record(date, calorieIdle, lastUpdate);
                recordList.add(r);
            }
        return recordList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

