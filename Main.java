package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product = new Product(1, "samsung", 34598);

        List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new MailLogger());
        loggers.add(new FileLogger());
        loggers.add(new DatabaseLogger());

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product);
        System.out.println();

        Product product1= new Product(2, "iphone", 67889.34);
        ProductManager productManager1 = new ProductManager(new jdbcProductDao(), loggers);

        productManager1.add(product1);
        System.out.println();
        System.out.println();
        
        productManager1.add(product);
    }
}
