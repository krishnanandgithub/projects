<%-- 
    Document   : index
    Created on : Sep 7, 2023, 2:37:24 PM
    Author     : krishananand Mishra
--%>

<%@page import="java.sql.*"%>
<%-- <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee information System</title>
    </head>
    <body>
        <h1>Employee information System</h1>
        <form  action="code.jsp" method="post">
            <table>
                <tr>
                    <td>Enter employee Id :</td>
                    <td><input type="text" name="empid"></td>
                </tr>
                <tr>
                    <td>Enter employee name :</td>
                     <td><input type="text" name="empname"></td>
                </tr>
                <tr>
                    <td>Select department :</td>
                    <td>
                        <select name="department">
                            <option selected>--Select Department--</option> 
                            <option value="Management">Management</option>
                            <option value="HR">HR</option>
                            <option value="Development">Development</option>
                            
                        </select>
                    </td>
                </tr> 
                <tr>
                    <td>
                        Enter slary :
                    </td>
                    <td><input type="number" name="salary"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Register"></td>
                </tr>
            </table> 
           
        </form>
        <br/>
        <table border="1">
            <tr>
                <th>Enployee Id</th>
                <th>Employee Name</th>
                <th>Department</th>
                <th>Salary</th>
            </tr> 
            <%
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?characterEncoding=utf-8","root","");
               //String query="select * from employee";
               PreparedStatement ps=con.prepareStatement("select * from employee");
               ResultSet rs=ps.executeQuery();
               while(rs.next())
               {
            %>     
               
            <tr>
                <td><%=rs.getString("empid")%></td>
                <td><%=rs.getString("empname")%></td>
                <td><%=rs.getString("department")%></td>
                <td><%=rs.getString("salary")%></td>
            </tr>
            
            <% 
               } 
            %>
            
            
            
        </table>
        
    </body>
</html>
