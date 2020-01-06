package controller;

import business.factory.FactoryEBO;
import com.google.gson.Gson;
import dao.dao.DAOException;
import entity.BookModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/deleteservlet")
public class DeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String value = req.getParameter("value");
        try {
            if(new FactoryEBO().getBookEBO().delete(value)){
                List<BookModel> list = new ArrayList<>();
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
