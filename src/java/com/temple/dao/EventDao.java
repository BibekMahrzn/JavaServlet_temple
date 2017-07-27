package com.temple.dao;

import com.temple.model.Event;
import com.temple.util.DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventDao {

    public static void insert(Event event) {
        String sql = "insert into event(event_name,event_time,hall_name,event_organizer,event_description) values('" + event.getEventName() + "','"
                + event.getEventTime() + "','" + event.getHallName() + "','" + event.getEventOrganizer() + "','" + event.getEventDescription() + "')";

        try {
            Statement st = DBUtil.con().createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static List<Event> select() {
        ArrayList al = new ArrayList();
        String sql = "select *from event";
        try {
            Statement st = DBUtil.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Event(rs.getInt("eid"), rs.getString("event_name"), rs.getString("event_time"), rs.getString("hall_name"), rs.getString("event_organizer"), rs.getString("event_description")));
            }
        } catch (Exception e) {
        }
        return al;

    }

    public static void delete(int id) {
        String sql = "delete from event where eid=" + id;
        try {
            Statement st = DBUtil.con().createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static Event selectById(int id) {
//        ArrayList al = new ArrayList();
        Event e = null;
        String sql = "select * from event where eid=" + id;
        try {
            Statement st = DBUtil.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                e = new Event(rs.getInt("eid"), rs.getString("event_name"), rs.getString("event_time"), rs.getString("hall_name"),
                        rs.getString("event_organizer"), rs.getString("event_description"));
            }
        } catch (Exception ex) {
        }
        return e;
    }

    public static void update(Event ev) {
        Statement st = null;
        String sql = "update event set event_name='" + ev.getEventName() + "'"
                + ",event_time='" + ev.getEventTime() + "'"
                + ",hall_name='" + ev.getHallName() + "',"
                + "event_organizer='" + ev.getEventOrganizer() + "',"
                + "event_description='" + ev.getEventDescription() + "' where eid=" + ev.getEid();
        try {
            st = DBUtil.con().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
