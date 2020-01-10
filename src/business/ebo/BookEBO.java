package business.ebo;

import business.ebi.BookEBI;
import dao.dai.IBaseDAO;
import dao.dao.DAOException;
import dao.factory.FactoryDAO;
import entity.ActivityModel;

import java.util.List;

public class BookEBO implements BookEBI {
    @Override
    public boolean create(ActivityModel ac) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.create(ac);
    }

    @Override
    public boolean delete(String ac_no) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.delete(ac_no);
    }

    @Override
    public boolean update(ActivityModel ac) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.update(ac);
    }

    @Override
    public List<ActivityModel> findAll() throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.findAll();
    }

    @Override
    public List<ActivityModel> findSome(String name) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.findSome(name);
    }

    @Override
    public List<ActivityModel> find(String ac_no) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.find(ac_no);
    }

    @Override
    public boolean adminlogin(String ad_no, String ad_name, String ad_password) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.adminlogin(ad_no, ad_name, ad_password);
    }

}
