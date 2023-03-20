package Servlet.MVCdemo03;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import pojo.Brand;
import service.BrandService;

import java.io.IOException;
import java.util.List;

@WebServlet( "/demo03/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    private BrandService brandService=new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MVC架構調用selectAll方法，並接收資料庫返回數據");
        List<Brand> brands=brandService.selectAll();
        request.setAttribute("brands",brands);
        System.out.println("Servlet已封裝數據，轉發交由jsp展示");
        request.getRequestDispatcher("BrandDemo03.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
