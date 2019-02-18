
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;

  
    /**
 *
 * @author Mohamed
 */
public interface ProductDAO {
    public ResultSet getSearchProducts(String search);
    //public void addProduct(Product p);
    public void deleteProduct(String productName) ;


}

