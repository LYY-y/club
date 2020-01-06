package business.ebo;

import business.ebi.BookEBI;
import dao.dai.IBaseDAO;
import dao.dao.DAOException;
import dao.factory.FactoryDAO;
import entity.BookModel;

import java.util.List;

public class BookEBO implements BookEBI {
    @Override
    public boolean create(BookModel book) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.create(book);
    }

    @Override
    public boolean delete(String isbn) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.delete(isbn);
    }

    @Override
    public boolean update(BookModel book) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.update(book);
    }

    @Override
    public List<BookModel> findAll() throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.findAll();
    }

    @Override
    public List<BookModel> findSome(String name) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.findSome(name);
    }

    @Override
    public List<BookModel> find(String name) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.find(name);
    }

    @Override
    public boolean readerlogin(String reader_no, String reader_name, String reader_password) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.readerlogin(reader_no, reader_name, reader_password);
    }

    @Override
    public boolean adminlogin(String ad_no, String ad_name, String ad_password) throws DAOException {
        IBaseDAO bdao = new FactoryDAO().getBookDAO();
        return bdao.adminlogin(ad_no, ad_name, ad_password);
    }

}
