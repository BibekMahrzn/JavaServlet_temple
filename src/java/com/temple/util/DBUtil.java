package com.temple.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Just me
 */
public class DBUtil {
    
    public static Connection con(){
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/temple", "postgres", "postgres");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
