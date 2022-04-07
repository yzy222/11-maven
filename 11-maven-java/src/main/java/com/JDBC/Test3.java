package com.JDBC;

import java.sql.*;
import java.util.ResourceBundle;

public class Test3 {
    public static void main(String[] args) {
        Statement statement=null;
        Connection conn=null;
        ResourceBundle bundle=ResourceBundle.getBundle("com/JDBC/data");
        String driver=bundle.getString("driver");
        String url=bundle.getString("url");
        String user=bundle.getString("user");
        String password=bundle.getString("password");
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            statement=conn.createStatement();
            String sql="update dept set loc='漳州' where deptno=50";
            int i=statement.executeUpdate(sql);
            System.out.println("修改条数"+i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
