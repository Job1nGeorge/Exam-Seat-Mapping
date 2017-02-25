<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<% 
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String dept=request.getParameter("department");
    String rno=request.getParameter("rnumber");
    String sem=request.getParameter("semester");
    String username=request.getParameter("username");
    String pass=request.getParameter("pass");
 
     String select="insert into student_reg(firstname,lastname,department,registernumber,semester,username,password) values('"+fname+"','"+lname+"','"+dept+"','"+rno+"','"+sem+"','"+username+"','"+pass+"')";
    if (cn.insert(select))
    {
        response.sendRedirect("../success.jsp");
    }
    else
    {
        response.sendRedirect("register.jsp");
    }
     %>
