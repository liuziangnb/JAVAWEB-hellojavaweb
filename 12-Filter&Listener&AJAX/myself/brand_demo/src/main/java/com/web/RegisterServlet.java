package com.web;

import com.pojo.User;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    private UserService service=new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取用户名和密码的数据
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        User user=new User();
        user.setUsername(username );
        user.setPassword(password);
        //2.获取用户输入的验证码
        String checkCode=request.getParameter("checkCode");

        //3.程序生成的验证码，从Session获取
        HttpSession session=request.getSession();
        String checkCodeGen=(String)session.getAttribute("checkCodeGem");

        //比对
        if(!checkCodeGen.equalsIgnoreCase(checkCode)){

            request.setAttribute("register_msg","验证码错误");
            request.getRequestDispatcher("/register.jsp").forward(request,response);


//            不允许注册
            return;
        }


            //2.调用service注册
        boolean flag=service.register(user);

            //3.判断成功与否
        if(flag){
            //注册成功，登录页面
            request.setAttribute("register_msg","注册成功，请登录");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {
        //注册失败，跳转到注册页面
            request.setAttribute("register_msg","用户已存在");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doGet(request, response);
    }
}
