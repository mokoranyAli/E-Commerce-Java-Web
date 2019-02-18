/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
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
