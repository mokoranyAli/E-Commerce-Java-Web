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
import model.user;

/**
 *
 * @author Mohamed
 */
@WebServlet(name = "RegisterServ", urlPatterns = {"/RegisterServ"})
public class RegisterServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        user u = new user();
             u.setSerial_number(request.getParameter("credit"));
             u.setUser_email(request.getParameter("Email"));
             u.setUser_password(request.getParameter("Password"));
             u.setRole("User");
             u.setUser_name(request.getParameter("credit"));
             u.setSerial_number(request.getParameter("Username"));
       
        String address = request.getParameter("address");
        String Confirm_Password = request.getParameter("Confirm_Password");
        String Role="User";
        Connection con = DatabaseConnection.getConnecttion();
        
          // if(password.equals(Confirm_Password))
               
        try {
            PreparedStatement pr =  con.prepareStatement(
                    "INSERT INTO `user`(`user_name`, `user_email`, `user_password`, `role`, `serial_number`) values (?,?,?,?,?)");
            pr.setString(1, u.getUser_name());
            pr.setString(2, u.getUser_email());
            pr.setString(3, u.getUser_password());
            pr.setString(4, u.getRole());
            pr.setString(5, u.getSerial_number());
            pr.executeUpdate();
            pr.close();
           
          request.setAttribute("user", u);         
          request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
    }

}
