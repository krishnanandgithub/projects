<%-- 
    Document   : index
    Created on : Oct 29, 2023, 10:26:24 PM
    Author     : krishananand Mishra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="css/style1.css" rel="stylesheet" type="text/css" />
        <script src="js/bootstrap.bundle.js"></script>
    </head>
    <body>
        
         <jsp:include page="header.jsp"/> 
         <jsp:include page="login.jsp"/>
          <jsp:include page="registration.jsp"/>
        <h1>Hello World!</h1>
    </body>
</html>
