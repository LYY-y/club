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

@WebServlet("/addServlet")
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
        String ac_no =req.getParameter("ac_no");
        String ac_name =req.getParameter("ac_name");
        String ac_time =req.getParameter("ac_time");
        String ac_type =req.getParameter("ac_type");
        String ac_detail =req.getParameter("ac_detail");
        ActivityModel ac = new ActivityModel(ac_no,ac_name,ac_time,ac_type,ac_detail);
        try {
            if(new FactoryEBO().getBookEBO().create(ac)){
                List<ActivityModel> list ;
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
