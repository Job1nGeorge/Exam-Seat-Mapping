<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<% 
    String branch=request.getParameter("branch");
    String select="insert into branch(branch)values('"+branch+"')";
    if (cn.insert(select))
    {
        response.sendRedirect("home.jsp");
    }
    else
    {
        response.sendRedirect("home.jsp");
    }
     %>
