package springstruts.model;

import springstruts.model.dao.DVDDAO;

import java.util.Collection;


public class DVDBO {
    //TODO declare an instance variable of type DVDDAO
    private DVDDAO dao;

    //TODO create the appropriate setter method
    public void setDao(DVDDAO dao) {
        this.dao = dao;
    }

    public Collection searchProductsByName(String name) {
        //TODO remove the current implementation and use the DAO to perform the search
        return dao.searchProductsByName(name);
    }

}
