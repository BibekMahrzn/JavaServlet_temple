package com.temple.dao;

import com.temple.model.Worship;
import com.temple.util.DBUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WorshipDao {

    public static void insert(Worship worship) {
        
        Statement st = null;
        String sql = "insert into worship(worship_name,worship_time,worship_guru) values('" + worship.getPujaName() + "','"
                + worship.getPujaTime() + "','" + worship.getPujaBy() + "')";

        try {
            st = DBUtil.con().createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static List<Worship> select() {
        ArrayList al = new ArrayList();
        Statement st = null;
        String sql = "select *from worship";
        try {
            st = DBUtil.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Worship(rs.getInt("wid"), rs.getString("worship_name"), rs.getString("worship_guru"), rs.getString("worship_time")));
            }
        } catch (Exception e) {
        }
        return al;

    }

    public static void delete(int id) {
        Statement st = null;
        String sql = "delete from worship where wid=" + id;
        try {
            st = DBUtil.con().createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e
            );
        }
    }

    public static Worship selectById(int id) {
        ArrayList al = new ArrayList();
        Statement st = null;
        String sql = "select * from worship where wid=" + id;

        try {
            st = DBUtil.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return (new Worship(rs.getInt("wid"), rs.getString("worship_name"), rs.getString("worship_guru"), rs.getString("worship_time")));
            }
        } catch (Exception e) {
        }
        return null;

    }

    public static void update(Worship w) {
        Statement st = null;
        String sql="update worship set worship_name='"+w.getPujaName()+"',worship_time='"+w.getPujaTime()+
                "',worship_guru='"+w.getPujaBy()+"' where wid="+w.getWid();
        try {
            st=DBUtil.con().createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

