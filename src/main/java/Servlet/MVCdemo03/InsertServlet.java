package Servlet.MVCdemo03;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import pojo.Brand;
import service.BrandService;

import java.io.IOException;
import java.util.List;

@WebServlet("/demo03/InsertServlet")
public class InsertServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MVC架構調用Insert方法，並接收使用者輸入資料後，向數據庫新增資料");

        Brand brand = new Brand(
                null,
                request.getParameter("brandName"),
                request.getParameter("companyName"),
                Integer.parseInt(request.getParameter("ordered")),
                request.getParameter("description"),
                Integer.parseInt(request.getParameter("status"))
        );

        brandService.Insert(brand);
        System.out.println("新增完成，重新查詢全部數據");
        request.getRequestDispatcher("selectAllServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}