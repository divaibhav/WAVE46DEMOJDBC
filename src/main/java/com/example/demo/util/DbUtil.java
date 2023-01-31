package com.example.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    //going to create one static method, which is going to return Connection obj
    public static Connection getDbConnection(){
        Connection con = null;
        //step 1 load and register the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2 get connection object
            String url = "jdbc:mysql://localhost:3306/studentdbwave46";
            String user = "root";
            String pass = "root@123";
            con = DriverManager.getConnection(url, user, pass);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

        return con;
    }
}
