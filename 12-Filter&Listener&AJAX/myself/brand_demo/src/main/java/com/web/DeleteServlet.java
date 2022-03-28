package com.web;

import com.pojo.Brand;
import com.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
    private BrandService service=new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接受id
        String id=request.getParameter("id");
        //2.嗲用service查询
        service.delete(Integer.parseInt(id));
        //3.存储到request中
        request.setAttribute("id",id);
        //4.转发
        request.getRequestDispatcher("/selectAllServlet").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doGet(request,response);
    }
}
