package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao,  List<Logger> loggers) {        //when productmanager invoked, you get an productdao
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        //iş kurallarını buraya yazacağız(writing the conditions of our business)
        if(product.getUnitPrice()<10){
            throw new Exception("unit price cant be lower than 10 bucks");
        }

        //jdbcProductDao productDao = new jdbcProductDao();
      //  productDao.add(product);

        //realize if we do this, then decide to pass to hibernate in accessing data. we need to change everything manually
        //like jdbcProctDao>>hibernateDao. This means we are tightly coupled.
        //if we have alternative choices like jdbc or hibernate, we should use interface.

       // ProductDao productDao = new HibernateProductDao();      **its bad code
        productDao.add(product);

        for(Logger logger:loggers){
            logger.log(product.getName());     //we used polymorphism
        }
    }


}
