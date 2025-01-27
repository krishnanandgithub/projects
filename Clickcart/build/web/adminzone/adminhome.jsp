<%-- 
    Document   : adminhome
    Created on : Dec 7, 2023, 1:11:43 PM
    Author     : krishananand Mishra
--%>
<%
if(session.getAttribute("adminid")==null)
{
    response.sendRedirect("../index.jsp");
}
else
{

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home Page</title>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../css/style.css" rel="stylesheet" type="text/css">
                <script src="../js/bootstrap.bundle.js"></script>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 

    </head>
    <body>
        <div class="container-fluid px-0">
            <div class="row  bg-warning">
                <h1 class="text-center ">This is Admin Pannel </h1>
            </div>
        </div>
        <div class="container">
        <div class="row mt-3">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <i class="fa-solid fa-users" ></i>

                        <h3 class="mt-3 text-center text-uppercase text-secondary">USER</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <i class="fa-solid fa-phone"></i>
                        <h3 class="mt-3 text-center text-uppercase text-secondary">Categories</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <h3 class="mt-3 text-center text-uppercase text-secondary">Products</h3>
                    </div>
                </div>
            </div>
        </div>
            <div class="row mt-3">
                <div class="col-sm-6">
                    <div class="card">
                    <div class="card-body">
                        <h3 class="mt-3 text-center text-uppercase text-secondary">Add Categories</h3>
                    </div>
                </div>
                </div>
                <div class="col-sm-6">
                    <div class="card">
                    <div class="card-body">
                        <h3 class="mt-3 text-center text-uppercase text-secondary">Add Product</h3>
                    </div>
                </div>
                </div>
            </div>
        </div>
    </body>
</html>
<%}%>