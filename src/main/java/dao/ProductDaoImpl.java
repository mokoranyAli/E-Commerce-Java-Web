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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author Mohamed
 */
public class ProductDaoImpl implements ProductDAO {

    public ResultSet getProduct() {
        Connection connection = DatabaseConnection.getConnecttion();
        String sql = "select * from shopping.product";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs != null) {
                return rs;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getSearchProducts(String search) {
        Connection connection = DatabaseConnection.getConnecttion();
        String sql = "select * from shopping.product where product_name LIKE ?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + search + "%");
            ResultSet rs = preparedStatement.executeQuery();
            if (rs != null) {
                return rs;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    

   
    @Override
    public void deleteProduct(String productName) {
        try {
            Connection connection = DatabaseConnection.getConnecttion();
            String sql = "Delete from shopping.product where product_name = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, productName);
            st.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
		
	
}
