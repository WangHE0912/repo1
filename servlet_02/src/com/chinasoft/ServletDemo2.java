package com.chinasoft;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

@WebServlet("/user/findAll")
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        *获取一个指定的请求头的值
        * */
          String referer=req.getHeader("Accept");
          System.out.println(referer);
          /*
          * 获取所有请求头的名称
          * */
//        Enumeration<String> headerNames=req.getHeaderNames();
///       Iterator<String>stringIterator=headerNames.asIterator();
//        while(stringIterator.hasNext()){
//            String head=stringIterator.next();
//            System.out.println(head);
        }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
