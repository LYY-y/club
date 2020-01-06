package business.factory;

import business.ebo.BookEBO;

public class FactoryEBO {
    public BookEBO getBookEBO(){
        return new BookEBO();
    }
}
