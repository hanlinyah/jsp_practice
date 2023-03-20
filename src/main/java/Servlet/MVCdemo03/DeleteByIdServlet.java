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

@WebServlet( "/demo03/DeleteByIdServlet")
public class DeleteByIdServlet extends HttpServlet {
    private BrandService brandService=new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MVC架構調用DeleteById方法，依據ID刪除數據");
        int id  = Integer.parseInt(request.getParameter("id"));
        brandService.DeleteById(id);
        System.out.println("刪除完成，重新查詢全部數據");
        request.getRequestDispatcher("selectAllServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
