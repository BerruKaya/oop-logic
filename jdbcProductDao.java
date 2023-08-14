package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements  ProductDao{

    //dao, data access object olarak açılır. objemizin veri erişimi için kullanılacağını anlatan yaygın bir isimlendirmedir.

    public void add(Product product){
        //only db access codes will be written here. SQL
        System.out.println("added to database with jdbc");

    }

    //business domain- aynı isimle ürün eklenmemesi.
    //business rules are special to your project domain(yu gotta code them in business module
}
