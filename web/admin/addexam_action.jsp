<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="exampack.Examclass" id="cn"/>
<%@page import="java.sql.*" %>
<%
    String date=request.getParameter("date");
    String start=request.getParameter("start");
    String end=request.getParameter("end");
    String branch=request.getParameter("branch");
    String sem=request.getParameter("semester");
    String sub=request.getParameter("subject");
    String select="insert into exam(date_exam,start_time,end_time,branch,semester,subject)values('"+date+"','"+start+"','"+end+"','"+branch+"','"+sem+"','"+sub+"')";
   if (cn.insert(select))
    {
        response.sendRedirect("add_exam.jsp");
    }
    else
    {
        response.sendRedirect("add_exam.jsp");
    }
     %>
