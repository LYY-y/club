package dao.factory;

import dao.dao.ClubDAO;

public class FactoryDAO {
    public ClubDAO getBookDAO(){
        return new ClubDAO();
    }
}
