/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohamed
 */
@WebServlet(name = "RegisterServ", urlPatterns = {"/RegisterServ"})
public class RegisterServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("Username");
        String Email = request.getParameter("Email");
        String address = request.getParameter("address");
        String serialNumber = request.getParameter("credit");
        String password = request.getParameter("Password");
        String Confirm_Password = request.getParameter("Confirm_Password");
        String Role="User";
        Connection con = DatabaseConnection.getConnecttion();
        
          // if(password.equals(Confirm_Password))
               
        try {
            PreparedStatement pr =  con.prepareStatement(
                    "INSERT INTO `user`(`user_name`, `user_email`, `user_password`, `role`, `serial_number`) values (?,?,?,?,?)");
            pr.setString(1, username);
            pr.setString(2, Email);
            pr.setString(3, password);
            pr.setString(4, Role);
            pr.setString(5, serialNumber);
            pr.executeUpdate();
            pr.close();
          // response.sendRedirect("products.html"); 
           request.setAttribute("username", username);
           request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
    }

}
