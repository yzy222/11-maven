package com.sweb;


import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;


//配置classpath ,;。。。。。
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("my first servlet hello world");
        // void setContentType(java.lang.String type)    设置正被发往客户端的响应的内容类型。
        //获取流对象之前
        servletResponse.setContentType("text/html");
        //servletResponse.setContentType("text/html;charset=UTF-8");
        // java.io.PrintWriter getWriter()  返回能够向一个客户机发送字符的 PrintWriter 对象。
        PrintWriter out = servletResponse.getWriter();
        //服务器刷新关闭
        out.println("hello servlet my first servlet");
        out.println("<h1>hello servlet</h1>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
