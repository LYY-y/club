package controller;

import common.PageBean;
import entity.ActivityModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/displayServlet")
public class DisplayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ActivityModel> list = (List<ActivityModel>) req.getAttribute("books");
        PageBean pb = new PageBean();
        pb.setPageSize(2);
        pb.setCurrPage(0);
        if (list.size() % pb.getPageSize() == 0){
            pb.setTotalPage(list.size() / pb.getPageSize());
        }else {
            pb.setTotalPage(list.size() / pb.getPageSize() +1);
        }
        pb.setPageList(list.subList(0,1*pb.getPageSize()-1));
        req.getSession().setAttribute("pb",pb);
        req.getSession().setAttribute("result",list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("list.jsp");
        dispatcher.forward(req,resp);
    }
}
