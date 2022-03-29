package com.web.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//替换httpServlet，根据请求的最后一段路径来进行方法分发

public class BaseServlet extends HttpServlet {

    //根据请求的最后一段路径来进行方法分发
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求的路径
        String uri=req.getRequestURI();//brand-case/brand/selectAll
//        System.out.println(uri);
        //2.获取最后一段路径、方法名
        int index =uri.lastIndexOf('/');

        String methodName=uri.substring(index+1);//   /selectAll
//        System.out.println(methodName);

        //2.执行方法
        //2.1获取BrandServlet /UserServlet 字节码对象 Class
        //谁调用我(this所在的方法），我（this）代表谁
        //System.out.println(this);       //BrandServlet
        Class<? extends BaseServlet> cls = this.getClass();

            //2.2获取方法Method对象
        try {
            Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //2.3执行方法
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
