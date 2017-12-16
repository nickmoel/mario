package com.moeller.launchcode;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SqliteJDBCDao implements MetrolinkDao {


    //@Autowired
    private SessionFactory sessionFactoryBean;

    public SqliteJDBCDao() {

    }

//    public List<Station> getStopsAllStops() {
//        // @TODO
//        sessionFactoryBean.getCurrentSession().beginTransaction();
//        Criteria criteria = sessionFactoryBean.getCurrentSession().createCriteria(Station.class);
//        List stops = criteria.list();
//        sessionFactoryBean.getCurrentSession().getTransaction().commit();
//        return stops;
//    }

    public List<Station> getStopsAllStops() {
        try {
            sessionFactoryBean.getCurrentSession().beginTransaction();

            Criteria criteria = sessionFactoryBean.getCurrentSession().createCriteria(Station.class);
            List<Station> stops = criteria.list();
            sessionFactoryBean.getCurrentSession().getTransaction().commit();
            return stops;
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        } finally {
            if (sessionFactoryBean != null) {
                sessionFactoryBean.close();
            }
        }
    }

            public List<Station> getStopsLike (String like){
                sessionFactoryBean.getCurrentSession().beginTransaction();
                Criteria criteria = sessionFactoryBean.getCurrentSession().createCriteria(Station.class);
                criteria.add(Restrictions.like("METROLINK STATION", "%" + like + "%"));
                List<Station> list = criteria.list();
                sessionFactoryBean.getCurrentSession().getTransaction().commit();
                return list;
            }

            public List<String> getArrivals () {
                sessionFactoryBean.getCurrentSession().beginTransaction();
                String sql = "SELECT arrival_time FROM stop_times WHERE stop_id = '" + Station.getID() + "' AND arrival_time > time('now', 'localtime') ORDER BY arrival_time asc;";
                Criteria criteria = sessionFactoryBean.getCurrentSession().createCriteria(Station.class);
                Query query = sessionFactoryBean.getCurrentSession().createSQLQuery(sql).addEntity(Station.class).setParameter("station", Station.getID());
                List<String> arrivals = criteria.list();
                sessionFactoryBean.getCurrentSession().getTransaction().commit();
                return arrivals;
            }
        }


//import org.springframework.stereotype.Component;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Nick on 9/8/2017.
// */
//@Component
//public class SqliteJDBCDao implements MetrolinkDao {
//
//    public static final String JDBC_SQLITE_METROLINK_DB = "jdbc:sqlite:metrolink.db";
//    public static final String ORG_SQLITE_JDBC = "org.sqlite.JDBC";
//
//
//    public List<Station> getStopsAllStops() {//retrieves stations
//
//        try (Connection connection = getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement("SELECT stops.stop_id, stops.stop_name FROM stops WHERE stop_name LIKE '%METROLINK STATION%' ORDER BY stop_name ASC");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            List<Station> stops = new ArrayList<>();
//            while (resultSet.next()) {
//                Station nextStop = new Station();
//                nextStop.setName(resultSet.getString("stop_name"));
//                nextStop.setID(resultSet.getString("stop_id"));
//                stops.add(nextStop);
//            }
//            return stops;
//        } catch (SQLException e) {
//            throw new RuntimeException("Error retrieving stops", e);
//        }
//    }
//
//    public List<String> getArrivals() {//retrieves arrival times
//        try (Connection conn = getConnection()) {
//            PreparedStatement statement = conn.prepareStatement("SELECT arrival_time FROM stop_times WHERE stop_id = '" + Station.getID()"' AND arrival_time > time('now', 'localtime') ORDER BY arrival_time asc;");
//            ResultSet resultSet = statement.executeQuery();
//            List<String> arrivals = new ArrayList<String>();
//            while (resultSet.next()) {
//                arrivals.add(resultSet.getString("arrival_time"));
//            }
//            return arrivals;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Unable to find Database", e);
//        }
//    }
//
//    private static Connection getConnection() throws SQLException {
//        try {
//            Class.forName(ORG_SQLITE_JDBC);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException("Unable to find class for loading the database", e);
//        }
//        return DriverManager.getConnection(JDBC_SQLITE_METROLINK_DB);
//    }
//}
