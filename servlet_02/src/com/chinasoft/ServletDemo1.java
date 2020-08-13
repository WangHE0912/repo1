package com.chinasoft;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
*             获取请求方式的方法:String str=getMethod()
             获取虚拟路径: String str=getContextPath()
             获取servlet路径:String str=getServletPath()
             获取请求参数:String str=getQueryString()
             获取请求的uri:String str=getRequestURI()
                          String str=getRequestURL()
             获取协议和版本号:String str=getProtocol()
             获取ip地址:String str=getRemoAddr()
			小鸟伏特加, 整这搞, 雷霆嘎巴, ZBC
* */
@WebServlet("/user/find")
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取请求方式
        String method=req.getMethod();
        System.out.println(method);
        //获取虚拟路径
        String contextPath=req.getContextPath();
        System.out.println(contextPath);
        //获取servlet路径
        String servletPath=req.getServletPath();
        System.out.println(servletPath);
        //获取请求参数
        String queryString=req.getQueryString();
        System.out.println(queryString);
        //获取uri和url地址
        String requestURI=req.getRequestURI();
        StringBuffer requestURL=req.getRequestURL();
        System.out.println("URI:"+requestURI+"-----"+"URL:"+requestURL);
        //获取协议版本号
        String protocol=req.getProtocol();
        System.out.println(protocol);
        //获取ip地址
        String remoteAddr=req.getRemoteAddr();
        System.out.println(remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
