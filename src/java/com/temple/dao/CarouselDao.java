package com.temple.dao;

import com.temple.model.Carousel;
import com.temple.model.Event;
import com.temple.util.DBUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarouselDao {

    public static void insert(Carousel c) {
        String sql = "insert into carousel(file,status) values('" + c.getFile() + "','" + c.getStatus() + "')";
        try {
            Statement st = DBUtil.con().createStatement();
            st.execute(sql);
        } catch (Exception e) {
        }
    }

    public static List<Carousel> select() {
        ArrayList al = new ArrayList();
        String sql = "select * from carousel";
        try {
            Statement st = DBUtil.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new Carousel(rs.getInt("id"), rs.getString("file"), rs.getString("status")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }

    public static void delete(int id) {
        String sql = "delete from carousel where id=" + id;
        try {
            Statement st = DBUtil.con().createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

	public static Carousel selectById(int id) {
//        ArrayList al = new ArrayList();
        String sql = "select * from carousel where id=" + id;
        try {
            Statement st = DBUtil.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return new Carousel(rs.getInt("id"),rs.getString("file"), rs.getString("status"));
            }
        } catch (Exception ex) {
        }
        return null;
    }

	public static void update(Carousel c) {
		String sql = "update carousel set file='"+c.getFile()+"', status='"+c.getStatus()+"' where id="+c.getId();
        try {
            Statement st = DBUtil.con().createStatement();
            st.execute(sql);
        } catch (Exception e) {
        }
	}
}
