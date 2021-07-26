package ActivityTrackerDao;

import ActivityTrackerModel.Place;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlaceDao {
    protected ConnManager connectionManager;
    private static PlaceDao instance = null;
    protected PlaceDao() {
        connectionManager = new ConnManager();
    }
    public static PlaceDao getInstance() {
        if(instance == null) {
            instance = new PlaceDao();
        }
        return instance;
    }

    public Place create(Place place) throws SQLException {
        String insertPlace = "INSERT INTO Place(SegmentID, PlaceID, Name, Type) VALUES" +
                "(?,?,?,?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        try {
            connection = connectionManager.getConnection();
            insertStmt = connection.prepareStatement(insertPlace);
            insertStmt.setInt(1, place.getSegmentId());
            insertStmt.setInt(2, place.getPlaceId());
            insertStmt.setString(3, place.getName());
            insertStmt.setString(4, place.getType().name());
            insertStmt.executeUpdate();
            return place;
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

    public ArrayList<Place> getAllPlaces() throws SQLException {
        String getPlace = "SELECT * FROM Places;";
        Connection connection = null;
        PreparedStatement selectStmt = null;
        ResultSet result = null;
        ArrayList<Place> pList = new ArrayList<>();
        try {
            connection = connectionManager.getConnection();
            selectStmt = connection.prepareStatement(getPlace);
            result = selectStmt.executeQuery();

            while (result.next()) {
                int placeTypeId = result.getInt("PlaceTypeId");
                int segmentId = result.getInt("SegmentId");
                int placeId = result.getInt("placeId");
                String name = result.getString("Name");
                Place.PlaceType type = Place.PlaceType.valueOf(result.getString("type"));
                Place place = new Place(placeTypeId, segmentId, placeId, name, type);
                pList.add(place);


            }
            return pList;

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
