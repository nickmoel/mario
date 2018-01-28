package com.moeller.launchcode;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SqliteJDBCDao implements MetrolinkDao {


    @Autowired
    private SessionFactory sessionFactoryBean;


    public SqliteJDBCDao() {

    }


    public List<Station> getStopsAllStops() {

        sessionFactoryBean.getCurrentSession().beginTransaction();
        String sql = "SELECT stops.stop_id, stops.stop_name FROM stops WHERE stop_name LIKE '%METROLINK STATION%' ORDER BY stop_name ASC";
        // Criteria criteria = sessionFactoryBean.getCurrentSession().createCriteria(Station.class);
        Query query = sessionFactoryBean.getCurrentSession().createSQLQuery(sql).addEntity(Station.class);
        List<Station> arrivals =query.list();

        sessionFactoryBean.getCurrentSession().getTransaction().commit();

        return arrivals;

    }


    public List<String> getArrivals() {
        sessionFactoryBean.getCurrentSession().beginTransaction();
        String sql = "SELECT arrival_time FROM stop_times WHERE stop_id LIKE :station AND arrival_time > time('now', 'localtime') ORDER BY arrival_time asc;";
//:station
        Query query = sessionFactoryBean.getCurrentSession()
                .createSQLQuery(sql)
                .addEntity(Station.class);

        query.setParameter("station", Station.getID());
        List <String> arrivals = query.list();
        sessionFactoryBean.getCurrentSession().getTransaction().commit();
        System.out.print(arrivals);
        return arrivals;

    }
}


//    public ArrayList<Time> getStationArrivals(int stationID)
//    {
//        sessionFactory.getCurrentSession().beginTransaction();
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Arrival.class);
//        criteria.add(Restrictions.eq("stop_id", stationID));
//        @SuppressWarnings("unchecked")
//        List<Arrival> list = criteria.list();
//        sessionFactory.getCurrentSession().getTransaction().commit();
//
//        return convertArrivals(list);
//    }










        //.setParameter("station", "%Station.getID()%");






//        List<?> resultRaw = query.list();
//        List<String> arrivalTimes = new ArrayList<String>(resultRaw.size());
//        for (Object a : resultRaw) {
//          arrivalTimes.add((String) a);
      // }
//        return arrivalTimes;

        //List<String> arrivalTimes = query.list();

        //arrivalTimes.forEach(System.out::println);
        //System.out.print(arrivalTimes);


//
//        System.out.print(resultRaw);
//
//






       // System.out.println(arrivalTimes.toString(list.toArray()));

//        for(String string : arrivalTimes) {
//            System.out.println(Station.getID());
//        }


//        String arrivals = arrivalTimes.get(0);

        //return arrivals;










//        String sql = "SELECT arrival_time FROM stop_times WHERE stop_id = '" + myStation.getID() + "' AND arrival_time > time('now', 'localtime') ORDER BY arrival_time asc;";
//        Query query = sessionFactoryBean.getCurrentSession().createSQLQuery(sql).addEntity(Station.class);
//        List<String> arrivals = query.list();
//
//        sessionFactoryBean.getCurrentSession().getTransaction().commit();
//        System.out.println(arrivals);
//        return arrivals;




