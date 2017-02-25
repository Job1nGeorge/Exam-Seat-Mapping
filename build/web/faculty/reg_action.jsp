<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<% 
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String dept=request.getParameter("department");
    String des=request.getParameter("designation");
    String username=request.getParameter("username");
    String pass=request.getParameter("pass");
 
     String select="insert into faculty_reg(firstname,lastname,department,designation,username,password) values('"+fname+"','"+lname+"','"+dept+"','"+des+"','"+username+"','"+pass+"')";
    if (cn.insert(select))
    {
        response.sendRedirect("../success.jsp");
    }
    else
    {
        response.sendRedirect("register.jsp");
    }
     %>
