package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //only db access codes will be written here. SQL
        System.out.println("added to database with hibernate");

    }
}
