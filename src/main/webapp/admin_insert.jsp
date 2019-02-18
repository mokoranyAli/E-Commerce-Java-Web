<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mycss.css" type="text/css" >
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/dbStyle.css">
        <link href="font-awesome-4.4.0/css/font-awesome.css" rel="stylesheet">
    </head>


    <body>

        <div class="container text-center">
            <h2>  Admin Page</h2>
        </div>
        <br /> <br />

        <form name="admin"  method="post">
            <div class="logmeout">
                <input type="submit" name="signout" class="btn btn-default" value=" Logout "> </div>
            <nav id="links"> 
                <ul>                                             

                    <li> <a href="admin_update.jsp" title="Update" > <i class="fa fa-pencil-square  fa-2x"></i>  </a> </li>
                    <li> <a href="admin_remove.jsp" title="Delete" > <i class="fa fa-trash-o  fa-2x "></i> </a> </li>                    
                    <li> <a href="admin_insert.jsp" title="Insert" > <i class="fa fa-plus-circle  fa-4x"> </i>  </a> </li>
                    <li> <a href="admin_view_all.jsp" title="View" > <i class="fa fa-eye  fa-2x"></i>  </a> </li>             
                </ul>
            </nav>


            <div class="container"> 
                <div class="row">
                    <div class="col-sm-4 col-sm-offset-4"  style="background-color: #ffffff;opacity:0.9;">       
                        <br />
                        <h3> Enter a product to insert </h3>


                        <%--   <div class="col-xs-12 col-sm-12 col-lg-12 no-padding">
     <div class="form-group ">
                   <label class="control-label" for="">Select Item</label>
                   <select name="admin_classifer_choice" required>
                   <option value="------"> </option>
                   <option value="Books"> Books </option> 
                   <option value="Electronics"> Electronics </option>
                   <option value="Icecream"> Ice Cream </option> 
                   
               <div class="help-block"></div>
                <div class="form-group">
                       <button type="submit" value="Insert" name="admin_catagory" class="btn btn-default" >Insert</button>

                        </div>                     </select> --%>


                    </div>
                </div>


                <br /> <br /> 
                <div class="container"  id="admin_mode"> </div>
                <%--
                   <label for="id">Product id:</label> 
                   <input type="text" class="form-control" name="admin_product_id"  required />
                --%>
                <label for="Name">Product Name:</label> 
                <input type="text" class="form-control" name="admin_product_name"  required />
                <label for="Type">Product Type :</label> 
                <input type="text" class="form-control" name="admin_product_type" required />
                <label for="Description">Product Description:</label> 
                <input type="text" class="form-control" name="admin_product_description" required/>
                <label for="Price">Product Price:</label> 
                <input type="text" class="form-control" name="admin_product_price" required />
            </div>
        </div>
        <br /> 
        <button type="submit" value="Insert" name="admin_db_changes" class="btn btn-default" >Insert</button>


    </div>

    <form>

        <footer  class="text-center">
            <div class="container col-lg-12 col-md-12 col-xs-12 no-padding"><br><br><br><br>
                <strong>Copyright &copy; 2019 <a>New Shop</a>.</strong> All rights reserved.
            </div>
        </footer>
        </body>
        </html>
