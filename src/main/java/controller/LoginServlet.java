/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ismail Elmogy
 */
package controller;

import dao.UserDAOImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDAOImpl userDAO = new UserDAOImpl();
    private List<Cart> cart = new ArrayList<Cart>();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String userEmail = request.getParameter("email");
        String password = request.getParameter("password");

        String err = "";
        if (userEmail.equals("") || password.equals("")) {
            err += "No data enter";
        } else {
            if (userEmail != null && password != null) {
                if (userDAO.login(userEmail, password) == false) {
                    err += "password or username not correct ";
                }
            }
        }

        if (err.length() > 0) {
            request.setAttribute("err", err);
        }

       
        try {
            if (err.length() == 0) {
                HttpSession session = request.getSession();
                session.setAttribute("userEmail", userEmail);
                session.setAttribute("cart", cart);
                userDAO.login(userEmail, password);
                Cookie userEmailDuringLogin = new Cookie("userEmail", userEmail);
                Cookie userPasswordDuringLogin = new Cookie("userPassword", password);
                userEmailDuringLogin.setMaxAge(30 * 60);
                userPasswordDuringLogin.setMaxAge(30 * 60);
                response.addCookie(userEmailDuringLogin);
                response.addCookie(userPasswordDuringLogin);
                User user = userDAO.getUser(userEmail);
                if (user.getRole().equals("user")) {
                    response.sendRedirect("index.jsp");
                    
                } else {
                    response.sendRedirect("home.jsp");
                }
            } else {
                
                RequestDispatcher rd = getServletContext()
                        .getRequestDispatcher("/login.jsp");
                rd.forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/login.jsp");
        }

    }

}
