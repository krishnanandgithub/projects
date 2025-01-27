<%-- 
    Document   : index
    Created on : Sep 5, 2023, 2:33:16 PM
    Author     : krishananand Mishra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Calculator</h1>
        <form method="post" action="code.jsp">
            <table>
                <tr>
                    <td>
                        Enter first no.
                    </td>
                    
                    <td>
                        <input type="number" name="n1">
                    </td>
                </tr>
                <tr>
                    <td>Enter second no.</td>
                    <td><input type="number" name="n2"></td>
                </tr>
                <tr>
                    <td>Select operation</td>
                    <td>
                        <input type="radio" name="op" value="add">+
                        <input type="radio" name="op" value="sub">-
                        <input type="radio" name="op" value="mul">*
                        <input type="radio" name="op" value="div">/
                    </td>
                    
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="calculate">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
