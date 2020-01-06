package controller;

import business.factory.FactoryEBO;
import dao.dao.DAOException;
import entity.BookModel;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class FindServlet extends HttpServlet {

    List<BookModel> books = new ArrayList();
    Connection dbconn = null;
    DataSource dataSource;  //声明一个数据源变量


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            books = new FactoryEBO().getBookEBO().findAll();
        } catch (DAOException e) {
            e.printStackTrace();
        }
        req.setAttribute("books", books);
        RequestDispatcher rd = req.getRequestDispatcher("/displayServlet");
        rd.forward(req,resp);
    }


}
