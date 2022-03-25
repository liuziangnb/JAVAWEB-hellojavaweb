package com.web;

import com.pojo.Brand;
import com.service.BrandService;
import com.utils.CheckCodeUtil;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        生成验证码
        ServletOutputStream os=response.getOutputStream();
        String checkCode= CheckCodeUtil.outputVerifyImage(100,50,os,4);


        //存入Session
        HttpSession session=request.getSession();
        session.setAttribute("checkCodeGem", checkCode);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doGet(request,response);
    }
}
