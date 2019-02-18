
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mycss.css" type="text/css" >
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/dbStyle.css">
        <link href="font-awesome-4.4.0/css/font-awesome.css" rel="stylesheet">
        <style type="text/css">
            #table_header{                
                background-color: orange;
                color:white;
            }
        </style>
    </head>
    <body>






        <div class="logmeout"> <input type="submit" name="signout" value=" Logout "> </div>
        <div class="container text-center">       
            <h2> Admin Page </h2>
        </div>
        <br /> <br />
        <form name="admin" action="admin_insert.jsp" method="post">
            <nav id="links"> 
                <ul>                                             
                    <li> <a href="admin_remove.jsp" title="Delete" > <i class="fa fa-trash-o  fa-2x "></i> </a> </li>                    
                    <li> <a href="admin_insert.jsp" title="Insert" > <i class="fa fa-plus-circle  fa-2x"> </i>  </a> </li>

                    <li> <a href="admin_view_all.jsp" title="View" > <i class="fa fa-eye  fa-4x"></i>  </a> </li>             
                    <li> <a href="admin_update.jsp" title="Update" > <i class="fa fa-pencil-square  fa-2x"></i>  </a> </li>

                </ul>
            </nav>

            <div class="" >      <br /><h3> Select a product to view </h3> <br />  <br /> 


                <div class="col-xs-12 col-sm-12 col-lg-12 no-padding">
                    <div class="form-group ">
                        <label class="control-label" for="">Select Item</label>
                        <select name="admin_classifer_choice">
                            <option value="------"> </option>
                            <option value="Books"> Books </option> 
                            <option value="Electronics"> Electronics </option>
                            <option value="Icecream"> Ice Cream </option> 
                        </select> 
                        <div class="help-block"></div>
                        <br/>
                      
 
                        <div class="form-group">
                            <button type="submit" value="Insert" name="admin_view_all_products"  onclick="search()" >
                                View All</button>

                        </div>

                    </div>
                </div>

                <%--
                 
                 <table class="table table-striped table-bordered">
                 <thead>
                     <tr>
                       <th> Item Id </th>
                         <th> Product Name </th>
                         <th> Brand/Author Name</th>
                         <th> Description </th>
                         <th> Price </th> 
                     
                     </tr>
                     </thead>
                    
                     <tbody>  
                     <tr>
                         <td> <%= productid.get(i - 1)%> </td> 
                         <td> <%= productname.get(i - 1)%>        </td>                                
                         <td> <%= brandname.get(i - 1)%>          </td>
                         <td> <%= productdescription.get(i - 1)%> </td>
                         <td> <%= productprice.get(i - 1)%>       </td>
                     </tr> 
                     </tbody>   

                       
                       
                    </table>
                --%>

                </center>
                <br /> <br />
                <form>
            </div>
            <footer class="text-center">
                <div class="container col-lg-12 col-md-12 col-xs-12 no-padding">
                    <br/>
                    <br/>
                    <br/>
                    <br/>
                    <br/>
                    <strong>Copyright &copy; 2019 <a>New Shop</a>.</strong> All rights reserved.
                </div>
            </footer>
               
                                
    </body>
</html>




