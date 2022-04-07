package com.JDBC;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) {
        Statement statement=null;
        Connection con=null;
        try {
            //1、注册驱动
            //static void deregisterDriver(Driver driver)
            //从 DriverManager的注册驱动程序列表中删除指定的驱动程序。

            Class driver=Class.forName("com.mysql.cj.jdbc.Driver");
            Driver driver1 =(java.sql.Driver)driver.newInstance();
            DriverManager.registerDriver(driver1);
            //2、获取连接
            //static Connection getConnection(String url)
            //尝试建立与给定数据库URL的连接。
            //static Connection getConnection(String url, Properties info)
            //尝试建立与给定数据库URL的连接。
            //static Connection getConnection(String url, String user, String password)
            //尝试建立与给定数据库URL的连接。
            String url="jdbc:mysql://127.0.0.1:3306/bjpowernode";
            String user="root";
            String password="yzy25138";
            con = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接对象"+con);
            //3、获取数据库操作对象
            //Statement createStatement()
            //创建一个 Statement对象，用于将SQL语句发送到数据库。
            statement = con.createStatement();
            //4、执行sql
            //int executeUpdate(String sql)
            //执行给定的SQL语句，这可能是 INSERT ， UPDATE ，或 DELETE语句，或者不返回任何内容，如SQL DDL语句的SQL语句。
            String sql="insert into dept(deptno,dname,loc) values(60,'人事部','北京')";
            //专门执行DML语句
            //返回值为影响的记录数
            int update=statement.executeUpdate(sql);
            System.out.println(update);
            //5、处理查询返回集
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }finally{
            //6、释放资源
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (con!=null){
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
