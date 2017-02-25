<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<%
    String hall=request.getParameter("hall");
    String num=request.getParameter("number");
    String seat=request.getParameter("seat");
    String select="insert into hall(hall_name,students_number,seats_number)values('"+hall+"','"+num+"','"+seat+"')";
   if (cn.insert(select))
    {
        response.sendRedirect("add_hall.jsp");
    }
    else
    {
        response.sendRedirect("ad_hall.jsp");
    }
     %>
