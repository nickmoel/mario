import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 9/8/2017.
 */
@Component
public class SqliteJDBCDao implements MetrolinkDao {

    public static final String JDBC_SQLITE_METROLINK_DB = "jdbc:sqlite:metrolink.db";
    public static final String ORG_SQLITE_JDBC = "org.sqlite.JDBC";
    private static SqliteJDBCDao dao;

    public static SqliteJDBCDao getInstance() {
        if (dao == null) {
            dao = new SqliteJDBCDao();
        }
        return dao;
    }

    public List<Station> getStopsAllStops() {//retrieves stations

        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT stops.stop_id, stops.stop_name FROM stops WHERE stop_name LIKE '%METROLINK STATION%' ORDER BY stop_name asc");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Station> stops = new ArrayList<>();
            while (resultSet.next()) {
                Station nextStop = new Station();
                nextStop.setName(resultSet.getString("stop_name"));
                nextStop.setID(resultSet.getString("stop_id"));
                stops.add(nextStop);
            }
            return stops;
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving stops");
        }
    }

    public List<String> getArrivals() {//retrieves arrival times
       try (Connection conn = getConnection()) {
            PreparedStatement statement = conn.prepareStatement("SELECT DISTINCT arrival_time FROM stop_times WHERE stop_id = '" + Station.getID()
                    + "' AND arrival_time > (SELECT strftime('%H:%M:%S',datetime(strftime('%s','now'),'unixepoch','localtime'))) ORDER BY arrival_time LIMIT 1;");
           ResultSet resultSet = statement.executeQuery();
            List<String> arrivals = new ArrayList<String>();
            while (resultSet.next()) {
                arrivals.add(resultSet.getString("arrival_time"));
            }
            return arrivals;
       } catch (SQLException e) {
            e.printStackTrace();
           throw new RuntimeException("Unable to find Database", e);
        }
    }
    private static Connection getConnection() throws SQLException {
        try {
            Class.forName(ORG_SQLITE_JDBC);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Unable to find class for loading the database", e);
        }
        return DriverManager.getConnection(JDBC_SQLITE_METROLINK_DB);
    }
}
