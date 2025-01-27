
<%@page import="java.sql.ResultSet"%>
<%@page import="dbpack.DbManager"%>
<%

if(request.getParameter("page").equals("registration"))
          {
          String name=request.getParameter("name");
          
          String email=request.getParameter("email");
          String password=request.getParameter("password");
          String phone=request.getParameter("phone");
          String address=request.getParameter("address");
          
          DbManager dm=new DbManager();
          String query="insert into customerinfo values('"+name+"','"+email+"','"+password+"','"+phone+"','"+address+"',curdate())";
          boolean res=dm.insertUpdateDelete(query);
          if(res==true)
          {
          out.print("<script>alert('Registration is done');window.location.href='indexc.jsp';</script>");
          }
          else
          {
          out.print("<script>alert('Registration is not submitted...Error...!!!');window.location.href='index.jsp';</script>");
          }
}
else if(request.getParameter("page").equals("adminlogin"))
{
          String userid=request.getParameter("userid");
          String password=request.getParameter("password");
          DbManager dm=new DbManager();
          String query="select * from login where userid='"+userid+"' and password='"+password+"'";
          ResultSet rs=dm.select(query);
          if(rs.next())
          {
              session.setAttribute("adminid", userid);
              response.sendRedirect("adminzone/adminhome.jsp");
          }
          else
          {
          out.print("<script>alert('Invalid user');window.location.href='index.jsp';</script>");
          }
          
          
}
%>