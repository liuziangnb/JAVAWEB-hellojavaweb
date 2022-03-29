//package com.web.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter("/*")
//public class LoginFilter implements Filter {
//
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
//        HttpServletRequest req=(HttpServletRequest) request;
////        判断访问资源路径是否跟访问注册相关
//        String[] urls={"/login.jsp","/imgs/","/css/","/loginServlet","/regiser.jsp","/registerServlet.jsp","/checkCodeServlet"};
//        //获取当前访问的资源路径
//       String url=req.getRequestURL().toString();
//
//       //循环判断
//        for(String u:urls){
//            if(url.contains(u)){
//                //找到了
//                // 放行
//                chain.doFilter(request,response);
//
//                return;
//            }
//        }
//
//
//        //1.判断session中是否有user
//        HttpSession session=req.getSession();
//        Object user=session.getAttribute("user");
//
//        //2.判断user是否为null
//        if(user!=null){
////            登陆过了
//
//            //放行
//            chain.doFilter(request, response);
//        }else{
////            没有登录
//            req.setAttribute("login_msg","尚未登录");
//            req.getRequestDispatcher("/login.jsp").forward(req,response);
//
//        }
//
//
//
//
//
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//    }
//
//    public void destroy() {
//    }
//
//
//}
