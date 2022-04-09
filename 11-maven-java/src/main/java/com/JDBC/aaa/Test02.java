package com.JDBC.aaa;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;
//解决sql注入
//PreparedStatement 升序降序时不适用
public class Test02 {
    public static void main(String[] args) {
        Map<String,String> userLoginfo=initUI();

        boolean loginSuccess=login(userLoginfo);
        System.out.println(loginSuccess?"登录成功":"登录失败");
    }

    /**
     * 用户登录
     * @param userLoginfo 用户登录信息
     * @return false表示失败 true表示成功
     */
    private static boolean login(Map<String, String> userLoginfo) {
        boolean loginSuccess=false;
        String loginName=userLoginfo.get("loginName");
        String loginPwd=userLoginfo.get("loginPwd");
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet resultSet=null;
        ResourceBundle bundle= ResourceBundle.getBundle("com/JDBC/data");
        String driver=bundle.getString("driver");
        String url=bundle.getString("url");
        String user=bundle.getString("user");
        String password=bundle.getString("password");
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,password);
            //?占位符
            String sql="select * from t_user where loginName=? and loginPwd=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,loginName);
            ps.setString(2,loginPwd);
            /*用户名：yyy
            密码：yy' '1'='1
            登录失败*/
            resultSet=ps.executeQuery();
            //int executeUpdate()
            if (resultSet.next())
                loginSuccess=true;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(ps!=null){
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

        return loginSuccess;
    }

    /**
     * 初始化登录界面
     * @return 用户输入的用户名和密码等登录信息
     */
    private static Map<String, String> initUI() {
        Scanner reader=new Scanner(System.in);

        System.out.print("用户名：");
        String loginName = reader.nextLine();

        System.out.print("密码：");
        String loginPwd = reader.nextLine();

        Map<String,String> userLoginfo=new HashMap<>();
        userLoginfo.put("loginName",loginName);
        userLoginfo.put("loginPwd",loginPwd);

        return userLoginfo;
    }
}
