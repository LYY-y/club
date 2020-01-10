package controller;

import business.factory.FactoryEBO;
import com.google.gson.Gson;
import dao.dao.DAOException;
import entity.ActivityModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addservlet")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String ISBN =req.getParameter("isbn");
        String book_name =req.getParameter("book_name");
        String book_author =req.getParameter("book_author");
        String book_press =req.getParameter("book_press");
        int public_year =Integer.parseInt(req.getParameter("public_year"));
        double book_price = Double.parseDouble(req.getParameter("book_price"));
        int book_storage =Integer.parseInt(req.getParameter("book_storage"));
        String book_type =req.getParameter("book_type");
        ActivityModel bm = new ActivityModel(ISBN,book_name,book_author,book_press,public_year,book_price,book_storage,book_type);
        try {
            if(new FactoryEBO().getBookEBO().create(bm)){
                List<ActivityModel> list = new ArrayList<>();
                list = new FactoryEBO().getBookEBO().findAll();
                Gson gson = new Gson();
                String jsonstr = gson.toJson(list);
                resp.getWriter().print(jsonstr);
            }
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

}
