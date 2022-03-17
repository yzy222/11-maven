package com.exception.homework;

public class User {
    /**
     * 用户注册方法
     * @param name 用户名
     * @param password 密码
     * @throws MyException 用户名为null，或者用户名长度小于6，或者用户名长度大于11会出现该异常
     */
    public void register (String name,String password) throws MyException {
        if (null==name||name.length()<6||name.length()>11)
            throw new MyException("用户名不规范");
        System.out.println("注册成功！欢迎"+name);
    }
}
