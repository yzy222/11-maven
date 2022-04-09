package com.JDBC.aaa;

import com.JDBC.JBDCUtil.JBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test04 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn= JBUtil.getConnect();
            String sql="select ename from emp where ename like ?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,"_a%");
            rs=ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JBUtil.close(conn,ps,rs);
        }
    }
}
