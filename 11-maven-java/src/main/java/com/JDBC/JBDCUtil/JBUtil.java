package com.JDBC.JBDCUtil;

import java.sql.*;
import java.util.ResourceBundle;

public class JBUtil {
    private JBUtil(){}
    static ResourceBundle bundle=null;
    static {
        bundle = ResourceBundle.getBundle("com/JDBC/JBDCUtil/data");
        String driver = bundle.getString("driver");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    } //*******
    public static Connection getConnect() throws SQLException {
        Connection conn=null;
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        conn= DriverManager.getConnection(url,user,password);
        return conn;
    }

    /**
     * 关闭资源
     * @param conn 连接对象
     * @param ps 数据库操作对象
     * @param rs 查询结果集
     */
    public static void close(Connection conn, Statement ps, ResultSet rs) {
        if (rs!=null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (ps!=null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 关闭资源
     * @param conn 连接对象
     * @param ps 数据库操作对象
     */
    public static void close(Connection conn, Statement ps) {
        if (ps!=null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
