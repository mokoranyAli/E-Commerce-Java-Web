
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




        <div class="container text-center"><h2> Admin Page </h2>
        </div> <br /> <br />
        <form name="admin"  method="post">
            <div class="logmeout"> <input type="submit" name="signout" value=" Logout "> </div>
            <nav id="links"> 
                <ul>                        

                    <li> <a href="admin_remove.jsp" title="Delete" > <i class="fa fa-trash-o  fa-2x "></i> </a> </li>                    
                    <li> <a href="admin_insert.jsp" title="Insert" > <i class="fa fa-plus-circle  fa-2x"> </i>  </a> </li>
                    <li> <a href="admin_update.jsp" title="Update" > <i class="fa fa-pencil-square  fa-4x"></i>  </a> </li>

                    <li> <a href="admin_view_all.jsp" title="View" > <i class="fa fa-eye  fa-2x"></i>  </a> </li>             
                </ul>
            </nav>
            <div class="container text-center"> 
                <br /><h3> Select a product to update </h3> 
                <br /> 
                <select name="admin_classifer_choice">
                    <option value=""> </option>
                    <option value="Books"> Books </option> 
                    <option value="Electronics"> Electronics </option>
                    <option value="Icecream"> Ice Cream </option> 
                </select> 
                <input type="submit"  value =" > " name="admin_catagory" /> <br /> <br /> 
                <div id="admin_mode"> </div>



                <label for="Name">Quantity :</label> 
                <input type="text" class="form-control" name="product_quantity" required />


                <label for="Price">Price</label> 
                <input type="text" class="form-control" name="product_price"  required />

                <label for="Description">Description:</label> 
                <input type="text" class="form-control" name="product_description" required />

                <br /> <br />

                <button type="submit" value="Update" name="admin_db_changes" class="btn btn-default" >Update</button>

            </div>
            <br /> <br />
            <form>
                </div>
                <footer class="text-center">
                    <div class="container col-lg-12 col-md-12 col-xs-12 no-padding">
                        <strong>Copyright &copy; 2019 <a>New Shop</a>.</strong> All rights reserved.
                    </div>
                </footer>
                </body>
                </html>
