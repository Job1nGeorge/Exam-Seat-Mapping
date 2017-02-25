<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<% 
    String branch=request.getParameter("branch");
    String sem=request.getParameter("semester");
    String sub=request.getParameter("subject");
    String select="insert into add_subject(branch,semester,subject)values('"+branch+"','"+sem+"','"+sub+"')";
    if (cn.insert(select))
    {
        response.sendRedirect("home.jsp");
    }
    else
    {
        response.sendRedirect("home.jsp");
    }
     %>
