package Servlet.MVCdemo03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Brand;
import service.BrandService;

import java.io.IOException;

@WebServlet("/demo03/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MVC架構調用Update方法，並接收使用者輸入資料後，向數據庫更新資料");

        Brand brand = new Brand(
                Integer.parseInt(request.getParameter("id")),
                request.getParameter("brandName"),
                request.getParameter("companyName"),
                Integer.parseInt(request.getParameter("ordered")),
                request.getParameter("description"),
                Integer.parseInt(request.getParameter("status"))
        );

        brandService.Update(brand);
        System.out.println("更新完成，重新查詢全部數據");
        request.getRequestDispatcher("selectAllServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}