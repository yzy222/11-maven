package com.JDBC.aaa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

//JBDC 事务自动提交
//void setAutoCommit(boolean autoCommit) 将此连接的自动提交模式设置为给定状态。  
public class Test03 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResourceBundle bundle=ResourceBundle.getBundle("com.JDBC.data");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
            String sql="insert dept(deptno,dname,loc) values(?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,60);
            ps.setString(2,"研发部");
            ps.setString(3,"北京");
            ps.executeUpdate();
            sql="update dept set dname=?,loc=? where deptno=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,"研发一部");
            ps.setString(2,"杭州");
            ps.setInt(3,60);
            ps.executeUpdate();
            sql="update dept set dname=?,loc=? where deptno=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,"研发二部");
            ps.setString(2,"非州");
            ps.setInt(3,60);
            ps.executeUpdate();
            conn.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException throwables1) {
                throwables1.printStackTrace();
            }
        }finally {
            if (ps == null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn == null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
