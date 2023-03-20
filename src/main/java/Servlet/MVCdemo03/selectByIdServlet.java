package Servlet.MVCdemo03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Brand;
import service.BrandService;

import java.io.IOException;
import java.util.List;

@WebServlet( "/demo03/selectByIdServlet")
public class selectByIdServlet extends HttpServlet {
    private BrandService brandService=new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MVC架構調用selectById方法，依據ID查詢數據");
        int id  = Integer.parseInt(request.getParameter("id"));
        Brand brand=brandService.selectById(id);
        request.setAttribute("brand",brand);
        System.out.println("Servlet已封裝數據，轉發交由jsp回顯數據以進行數據修改");
        request.getRequestDispatcher("UpdateBrand.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
