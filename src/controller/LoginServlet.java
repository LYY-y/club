package controller;

import business.factory.FactoryEBO;
import dao.dao.DAOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
            String ad_no = req.getParameter("ad_no");
            String ad_name = req.getParameter("ad_name");
            String ad_password = req.getParameter("ad_password");
        boolean login = false;
        try {
            login = new FactoryEBO().getBookEBO().adminlogin(ad_no,ad_name,ad_password);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        if(login){
                RequestDispatcher dispatcher = req.getRequestDispatcher("/book_manage.jsp");
                dispatcher.forward(req,resp);
            }else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
                dispatcher.forward(req,resp);
            }
    }
}
