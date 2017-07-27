/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temple.dao;

import com.temple.model.Login;
import com.temple.util.DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class LoginDao {

    public static boolean validate(Login login) {
        boolean b = false;
        String sql = "select * from login where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
        try {
            Statement st = DBUtil.con().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) 
                b = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return b;
    }
}
