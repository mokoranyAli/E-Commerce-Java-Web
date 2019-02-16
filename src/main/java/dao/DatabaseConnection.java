/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ismail Elmogy
 */
public class DatabaseConnection {

    
    public static Connection getConnecttion() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/shopping", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		System.out.println(getConnecttion());
	}
}
