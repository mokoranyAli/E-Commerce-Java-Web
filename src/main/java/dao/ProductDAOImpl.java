package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;

import model.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void addProduct(Product product) {
		Connection connection = DatabaseConnection.getConnecttion();
		String sql = "insert into shopping.product values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getProductName());
                        preparedStatement.setInt(2, product.getProductPrice());
                        preparedStatement.setString(3,product.getProductType() );
                        preparedStatement.setString(4,product.getProductDescription());
                        preparedStatement.setString(5, product.getProductImage());
                        preparedStatement.setInt(6, product.getProductQuantity());
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	



	

	
}
