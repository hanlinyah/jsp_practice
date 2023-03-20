package Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import pojo.Brand;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo02")
public class ServletDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Brand> brands=new ArrayList<>();
        brands.add(new Brand(1,"Meta","MetaSoft",20,"So soft..",1));
        brands.add(new Brand(2,"Doo","Doodle",2,"Just Doo it..",0));
        brands.add(new Brand(3,"MaMa","AaLiMaMa",10,"Ur Best Choice..",1));
        request.setAttribute("brands",brands);
        System.out.println("Servlet已封裝數據，轉發交由jsp展示");
        request.getRequestDispatcher("/BrandDemo02.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
