<%-- 
    Document   : code
    Created on : Sep 7, 2023, 12:14:13 AM
    Author     : krishananand Mishra
--%>

<% 
// request.getParameter() --> this method always return String value
    int n1=Integer.parseInt(request.getParameter("n1"));
    int n2=Integer.parseInt(request.getParameter("n2"));
    String op=request.getParameter("op");
    int res;
    if(op.equals("add"))
    {
    res=n1+n2;
    }
    else if(op.equals("sub"))
    {
    res=n1-n2;
    }
    else if(op.equals("mul"))
    {
    res=n1*n2;
    }
    else if(op.equals("div"))
    {  
             res=n1/n2; 
    }
    
    else
    {
    res=0;
    }    
    out.print("<h1>Result="+res+"</h1>");
%>