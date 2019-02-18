/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.UserDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Mohamed
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
     private UserDAOImpl userDAO = new UserDAOImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               User u = new User();
             u.setSerialNumber(request.getParameter("credit"));
             u.setUserEmail(request.getParameter("Email"));
             u.setUserPassword(request.getParameter("Password"));
             u.setRole("User");
             u.setUserName(request.getParameter("Username"));      
            u.setUserAddress( request.getParameter("address")); 
           // String Confirm_Password = request.getParameter("Confirm_Password");        
         boolean checkSignIN =  userDAO.Register(u);
         
           if(checkSignIN == true)
           {
               System.err.println(checkSignIN);
               HttpSession session = request.getSession();
	       session.setAttribute("user", u);
                    //request.getRequestDispatcher("index.jsp").forward(request, response);
                    response.sendRedirect("index.jsp");
           }
           else {
               System.err.println("anything");
           }
         
         
        } 

}
