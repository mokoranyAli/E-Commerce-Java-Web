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
            <h2> Admin Page </h2></center> <br /> <br />
        <form name="admin" method="post">
            <div class="logmeout"> <input type="submit" name="signout"  class="btn btn-default" value=" Logout "> </div>
            <nav id="links"> 
                <ul>                        
                    <li> <a href="admin_update.jsp" title="Update" > <i class="fa fa-pencil-square  fa-2x"></i>  </a> </li>
                    <li> <a href="admin_insert.jsp" title="Insert" > <i class="fa fa-plus-circle  fa-2x"> </i>  </a> </li>
                    <li> <a href="admin_remove.jsp" title="Delete" > <i class="fa fa-trash-o  fa-4x "></i> </a> </li>                    

                    <li> <a href="admin_view_all.jsp" title="View" > <i class="fa fa-eye  fa-2x"></i>  </a> </li>             
                </ul>
            </nav>
            <div class="container"> 
                <div class="row">


                    <div class="col-xs-12 col-sm-12 col-lg-12 no-padding">

                        <br /><h3> Select a product to remove </h3> <br />                        
                        <div class="container">                          
                            <label>Product Name: <input type="text" name="product_name" required/></label>
                            <button type="submit" value="  Delete  " class="btn btn-default" name="admin_db_delete"> Delete</button> <br/>
                        </div>

                    </div>
                </div>
            </div>
    </div>

    <br /> <br />
    <br /> <br />
    <br /> <br />
    <br /> <br />
    <br /> <br />
    <form>
        <footer class="text-center">
            <div class="container col-lg-12 col-md-12 col-xs-12 no-padding">
                <strong>Copyright &copy; 2019 <a>New Shop</a>.</strong> All rights reserved.
            </div>
        </footer>

</body>
</html>
