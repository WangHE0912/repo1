package com.chinasoft;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/test")
public class ServletDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数的通用方法：String getParameter(String name): 获取指定参数名称的参数值
        // String[] getParameterValues(String name):根据指定参数名称获取参数值数组
        // Enumeration<String> getParameterNames():获取所有参数的名称
        // Map<String,String[]> getParameterMap():获取所有参数的Map集合
             String name=request.getParameter("name");
             System.out.println(name);

             //从作用域对象中取数据
           Object test=  request.getAttribute("test");
                  System.out.println(test);

             response.setContentType("text/html;charset=utf-8");
             response.getWriter().write("<h1>登录成功</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
