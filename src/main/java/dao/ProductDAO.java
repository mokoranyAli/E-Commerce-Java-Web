
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;

public class ProductDAO {
    public ResultSet getProduct() {
		Connection connection = DatabaseConnection.getConnecttion();
		String sql = "select * from shopping.product";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs!=null) {
                            return rs;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
    
}

