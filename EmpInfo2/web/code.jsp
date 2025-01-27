<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@page import="java.sql.DriverManager"%>
<%
String empid=request.getParameter("empid");
String empname=request.getParameter("empname");
String department=request.getParameter("department");
int salary=Integer.parseInt(request.getParameter("salary"));
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?characterEncoding=utf-8","root","");
String query="insert into employee values('"+empid+"','"+empname+"','"+department+"','"+salary+"')";
PreparedStatement ps= con.prepareStatement(query);
ps.executeUpdate();
con.close();
out.print("<script>alert('Registration is done');window.location.href='index.jsp';</script>");
%>

