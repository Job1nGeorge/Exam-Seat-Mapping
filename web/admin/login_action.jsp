<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page  import="java.sql.*" %>
<%
    session.getAttribute("username");
    String user=request.getParameter("username");
    String pass=request.getParameter("password");
    String query="select * from admin_login where username='"+user+"' AND password='"+pass+"'";
    ResultSet rs=cn.select(query);
    if(rs.next())
    {
        response.sendRedirect("home.jsp");
        
    }
    else
    {
        response.sendRedirect("login.jsp");
        
    }
    %>