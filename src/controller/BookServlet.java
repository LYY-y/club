package controller;

import business.factory.FactoryEBO;
import dao.dao.DAOException;
import entity.BookModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/bookservlet")
public class BookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            String state = req.getParameter("state");
            String value;
            List<BookModel> books = new ArrayList();
            if( "1".equals(state)){
                value = req.getParameter("value");
                books = new FactoryEBO().getBookEBO().find(value);
                req.setAttribute("books",books);
                RequestDispatcher rd = req.getRequestDispatcher("re_showbook.jsp");
                rd.forward(req,resp);
            }else if("2".equals(state)){
                value = req.getParameter("value");
                books = new FactoryEBO().getBookEBO().findSome(value);
                req.setAttribute("books",books);
                RequestDispatcher rd = req.getRequestDispatcher("re_showbook.jsp");
                rd.forward(req,resp);
            }else if("3".equals(state)) {
                books = new FactoryEBO().getBookEBO().findAll();
                req.setAttribute("books", books);
                RequestDispatcher rd = req.getRequestDispatcher("re_showbook.jsp");
                rd.forward(req,resp);
            }else if("4".equals(state)){
                books = new FactoryEBO().getBookEBO().findAll();
                req.setAttribute("books", books);
                RequestDispatcher rd = req.getRequestDispatcher("ad_showbook.jsp");
                rd.forward(req,resp);
            }

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }


}
