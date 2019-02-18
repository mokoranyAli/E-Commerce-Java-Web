package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;


import model.User;

public class UserDAOImpl implements UserDAO {

    // insert new user into database
	@Override
	public void addUser(User user) {
		Connection connection = DatabaseConnection.getConnecttion();
		String sql = "insert into shopping.user value(?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getUserEmail());
			preparedStatement.setString(4, user.getUserPassword());
                        preparedStatement.setString(5, user.getRole());
			preparedStatement.setString(6, user.getSerialNumber());
                        preparedStatement.setString(7, user.getUserAddress());
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
        
	@Override
	public boolean checkUser(String userName) {
		Connection connection = DatabaseConnection.getConnecttion();
		String sql = "select * from shopping.user where user_name='" + userName + "'";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				connection.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

  
	@Override
	public boolean login(String userEmail, String userPassword) {
		Connection connection = DatabaseConnection.getConnecttion();
		String sql = "select * from shopping.user where user_email='" + userEmail
				+ "' and user_password='" + userPassword + "'";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				connection.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateUser(User user) {
		Connection connection = DatabaseConnection.getConnecttion();
		String sql = "update shopping.user set user_id = ?,user_email = ?, user_password = ?, role = ?,serial_number = ?"
                        + ",user_address = ? where user_name=?";
		
                
                PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setInt(1, user.getUserId());
                        preparedStatement.setString(2, user.getUserEmail());
			preparedStatement.setString(3, user.getUserPassword());
                        preparedStatement.setString(4, user.getRole());
			preparedStatement.setString(5, user.getSerialNumber());
                        preparedStatement.setString(6, user.getUserAddress());
                        preparedStatement.setString(7, user.getUserName());
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		
	}


        @Override
        public boolean Register (User u)
        {
        
            Connection con = DatabaseConnection.getConnecttion();
        
          // if(password.equals(Confirm_Password))
               
        try {
            PreparedStatement pr =  con.prepareStatement(
                    "INSERT INTO `shopping`.`user`(`user_name`, `user_email`, `user_password`, `role`, `serial_number`) values (?,?,?,?,?)");
            pr.setString(1, u.getUserName());
            pr.setString(2, u.getUserEmail());
            pr.setString(3, u.getUserPassword());
            pr.setString(4, u.getRole());
            pr.setString(5, u.getSerialNumber());
            pr.executeUpdate();
            pr.close();
                return true;
        }
        catch (Exception e){
            return false;
        }
   
        }

    @Override
    public User getUser(String userEmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
}
