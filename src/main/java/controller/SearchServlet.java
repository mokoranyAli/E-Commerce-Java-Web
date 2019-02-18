/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import dao.ProductDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

/**
 *
 * @author Mohamed
 */
@WebServlet(name = "SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String search= request.getParameter("SearchField") ;
            
            
            ArrayList<Product> list=new ArrayList<Product>();
            Product p =null;
           // list.add(p);
        PrintWriter out = response.getWriter();
        

        ProductDaoImpl productDAO = new ProductDaoImpl();


            ResultSet rs = productDAO.getSearchProducts(search);
            if (rs != null) {
                try {   
                    
                    
                    while (rs.next()) {
                        Product product = new Product();
                        
                        product.setProductId(rs.getInt(1));
                      
                        product.setProductName(rs.getString(2));
                        product.setProductPrice(rs.getInt(3));
                        product.setProductType(rs.getString(4));
                        product.setProductDescription(rs.getString(5));
                        product.setProductRepresentation(rs.getString(6));
                        list.add(product);
                    }
                }
                catch (SQLException ex) {
                  //  Logger.getLogger(ShoesController.class.getName()).log(Level.SEVERE, null, ex);
                }

                request.setAttribute("list", list);
                RequestDispatcher ry = request.getRequestDispatcher("SearchResult.jsp");
                ry.include(request, response);
            }
           
   }
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}
