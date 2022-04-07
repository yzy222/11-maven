package com.JDBC;

import java.sql.*;
import java.util.ResourceBundle;

public class Test4 {
    public static void main(String[] args) {
        Statement statement=null;
        Connection conn=null;
        ResultSet result=null;
        ResourceBundle bundle=ResourceBundle.getBundle("com/JDBC/data");
        String driver=bundle.getString("driver");
        String url=bundle.getString("url");
        String user=bundle.getString("user");
        String password=bundle.getString("password");
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,password);
            statement=conn.createStatement();
            String sql="select * from dept";
            //ResultSet executeQuery(String sql)
            //执行给定的SQL语句，该语句返回单个 ResultSet对象。
            result=statement.executeQuery(sql);
            //boolean next()
            //将光标从当前位置向前移动一行。
            while(result.next()) {
                //String getString(int columnIndex)
                //String getString(String columnLabel)
                //这个检索的当前行中指定列的值 ResultSet对象为 String的Java编程语言。
                //特定类型getInt、getDouble、getLong
                String deptno = result.getString(1);
                String dname = result.getString(2);
                String loc = result.getString(3);
                System.out.println(deptno + ":" + dname + ':' + loc);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            if (result!=null){
                try {
                    result.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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
